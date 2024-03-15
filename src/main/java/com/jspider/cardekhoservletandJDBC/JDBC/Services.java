package com.jspider.cardekhoservletandJDBC.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class Services {
	private static Connection connection;
	private static PreparedStatement preparedStatement;
	private static String query;
	private static ResultSet resultSet;
	private static com.mysql.cj.jdbc.Driver driver;
	public static boolean logIn(String username,String password) {		
		boolean flag=false;
		try {
			
			openConnection();
			query = "select * from app_admin where email = ? AND password =?";
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, username);
			preparedStatement.setString(2, password);
			resultSet = preparedStatement.executeQuery();
			if (resultSet.next()) {
				flag=true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				closeConnection();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return flag;
	
	}
	public static void openConnection() throws SQLException {
		driver=new com.mysql.cj.jdbc.Driver();
		DriverManager.registerDriver(driver);
		connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/weja4","root","root");
	}
	public static void closeConnection() throws SQLException {
		if (connection != null) {
			connection.close();
		}
		if (preparedStatement != null) {
			preparedStatement.close();
		}
		if (resultSet!=null) {
			resultSet.close();
		}
		DriverManager.deregisterDriver(driver);
	}


}
