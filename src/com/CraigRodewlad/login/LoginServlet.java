package com.CraigRodewlad.login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class WebsiteServlets
 */
@WebServlet("/LoginServlets")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	Member member = new Member(null, null, null);
	
    /**
     * Default constructor. 
     */
    public LoginServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String phoneNumber = request.getParameter("form-phoneNumber");
		System.out.println(phoneNumber);
		
		String firstName = request.getParameter("form-firstname");
		String lastName = request.getParameter("form-lastname");
		String phoneNumber2 = request.getParameter("form-phonenumber");
		System.out.println(firstName);
		System.out.println(lastName);
		System.out.println(phoneNumber2);
		
		if (phoneNumber.equals(null)) {
			PatronsAccess.addNewMemberToDatabase(firstName, lastName, phoneNumber2);
		}
		else {
			Member member = PatronsAccess.checkIfMemberExists(phoneNumber);
			System.out.println("Login successfull!");
			
			if (!(member.equals(null))) {
				
				request.setAttribute("member",(member.getFirstName()+ " " + member.getLastName()));
				getServletContext().getRequestDispatcher("/MemberPage.jsp").forward(request, response);
			}
			
		}
		
	}

}
