package com.CraigRodewlad.login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

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
			System.out.println("Error" + e);
		}
	}

	public static void readDataBase() {
		try {
			startConnection();
			statement = connect.createStatement();

			resultSet = statement.executeQuery("SELECT * FROM library.patrons");

			while (resultSet.next()) {
				String firstName = resultSet.getString("first_name");
				String lastName = resultSet.getString("last_name");
				String phoneNumber = resultSet.getString("phone_number");
				String dateVisited = resultSet.getString("date_visited");

				System.out.println("First Name: " + firstName);
				System.out.println("Last Name: " + lastName);
				System.out.println("Phone Number: " + phoneNumber);
				System.out.println("Date Visited: " + dateVisited);
				System.out.println();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void addNewMemberToDatabase(String firstName, String lastName, String phoneNumber) {

		try {
			startConnection();
			preparedStatement = connect
					.prepareStatement("INSERT INTO patrons (first_name, last_name, phone_number) VALUES (?,?,?)");
			preparedStatement.setString(1, firstName);
			preparedStatement.setString(2, lastName);
			preparedStatement.setString(3, phoneNumber);
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
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
			// TODO: handle exception
		}
		return null;
	}
	
	public static void retrieveCalendarInfo(){
		try {
			startConnection();
			preparedStatement = connect.prepareStatement("SELECT * FROM library.calendar_events");
			resultSet = preparedStatement.executeQuery();
			
			System.out.println("Upcoming events:");
			
			while (resultSet.next()) {
				String eventName = resultSet.getString("event_name");
				String eventDate = resultSet.getString("event_date");
				String eventDescription = resultSet.getString("event_description");
				
				System.out.println(eventName + " on " + eventDate);
				System.out.println(eventDescription);
				System.out.println();
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
