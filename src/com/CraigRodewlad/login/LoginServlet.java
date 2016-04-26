package com.CraigRodewlad.login;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LoginServlets")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	Member member = new Member();
	CalendarEvents event = new CalendarEvents();

	public LoginServlet() {
		
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String phoneNumber = request.getParameter("form-phoneNumber");
		System.out.println(phoneNumber);

		member.setFirstName(request.getParameter("form-firstname"));
		member.setLastName(request.getParameter("form-lastname"));
		member.setPhoneNumber(request.getParameter("form-phonenumber"));
		System.out.println(member.getFirstName());
		System.out.println(member.getLastName());
		System.out.println(member.getPhoneNumber());

		try {
			
			if (!(phoneNumber.equals(null))) {
				Member member = PatronsAccess.checkIfMemberExists(phoneNumber);
				System.out.println("Login successfull!");

				if (!(member.equals(null))) {
					ArrayList<CalendarEvents> eventList = PatronsAccess.retrieveCalendarInfo();

					request.setAttribute("member", (member.getFirstName() + " " + member.getLastName()));

					for (CalendarEvents event : eventList) {
						request.setAttribute("eventName", event.getEventName());
						request.setAttribute("eventDate", event.getEventDate());
						request.setAttribute("eventTime", event.getEventTime());
						request.setAttribute("eventDescription", event.getEventDescription());
						getServletContext().getRequestDispatcher("/NewMember.jsp").forward(request, response);

					}
				}
			}
			
		} catch (Exception NullPointerException) {
			
			PatronsAccess.addNewMemberToDatabase(member);
			getServletContext().getRequestDispatcher("/LandingPage.html").forward(request, response);
		}
	}
}
