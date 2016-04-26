package com.CraigRodewlad.login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class PatronsAccess {
	private static Connection connect = null;
	private static Statement statement = null;
	private static PreparedStatement preparedStatement = null;
	private static ResultSet resultSet = null;

	private static void startConnection() {
		String dbURL = "jdbc:mysql://localhost:3306/library?";
		String userName = "root";
		String password = "sesame";
		
		try {
			Class.forName("com.mysql.jdbc.Driver");

			connect = DriverManager.getConnection(dbURL, userName, password);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void readDataBase() {
		try {
			ArrayList<Member> memberList = new ArrayList<>();
			
			startConnection();
			statement = connect.createStatement();
			resultSet = statement.executeQuery("SELECT * FROM library.patrons");

			while (resultSet.next()) {
				Member currentMember = new Member();
				currentMember.setFirstName(resultSet.getString("first_name"));
				currentMember.setLastName(resultSet.getString("last_name"));
				currentMember.setPhoneNumber(resultSet.getString("phone_number"));
				memberList.add(currentMember);
			}
			
			for (Member member : memberList) {
				System.out.println(member.getFirstName());
				System.out.println(member.getLastName());
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void addNewMemberToDatabase(Member newMember) {

		try {
			startConnection();
			preparedStatement = connect
					.prepareStatement("INSERT INTO patrons (first_name, last_name, phone_number) VALUES (?,?,?)");
			preparedStatement.setString(1, newMember.getFirstName());
			preparedStatement.setString(2, newMember.getLastName());
			preparedStatement.setString(3, newMember.getPhoneNumber());
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static Member checkIfMemberExists(String phoneNumber) {
		try {
			startConnection();
			statement = connect.createStatement();
			resultSet = statement.executeQuery("SELECT * FROM library.patrons");


			while (resultSet.next()) {
				String userPhoneNumber = resultSet.getString("phone_number");
				System.out.println(userPhoneNumber);
				if (userPhoneNumber.equalsIgnoreCase(phoneNumber)) {
					Member member = new Member(null, null, null);
					member.setFirstName(resultSet.getString("first_name"));
					member.setLastName(resultSet.getString("last_name"));
					member.setPhoneNumber(resultSet.getString("phone_number"));
					return member;
				}
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public static ArrayList<CalendarEvents> retrieveCalendarInfo(){
		
		try {
			ArrayList<CalendarEvents> eventList = new ArrayList<>();
			startConnection();
			preparedStatement = connect.prepareStatement("SELECT * FROM library.calendar");
			resultSet = preparedStatement.executeQuery();
			
			System.out.println("Upcoming events:");
			
			while (resultSet.next()) {
				CalendarEvents event = new CalendarEvents();
				event.setEventName(resultSet.getString("event_name"));
				event.setEventDate(resultSet.getString("event_date"));
				event.setEventTime(resultSet.getString("event_time"));
				event.setEventDescription(resultSet.getString("event_description"));
				
				eventList.add(event);
			}
			
			for (CalendarEvents event : eventList) {
				System.out.println(event.getEventName());
			}
			
			return eventList;
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
		
	}

}
