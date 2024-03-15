package com.jspider.cardekhoservletandJDBC.object;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.http.HttpServlet;

import com.mysql.cj.jdbc.Driver;

public class CheckCar extends HttpServlet {
	private static Connection connection;
	private static PreparedStatement preparedStatement;
	private static ResultSet resultSet;
	private static String query;
	private static Driver driver;

	private static final long serialVersionUID = 1L;

	public static void checkID(int id) throws Exception {

		try {
			openConnection();
			query = "select * from car where id=?";
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setInt(1, id);
			resultSet = preparedStatement.executeQuery();

		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			closeConnection();
		}
	}

	private static void openConnection() throws SQLException {
		driver = new com.mysql.cj.jdbc.Driver();
		connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/weja4", "root", "root");
	}

	private static void closeConnection() throws Exception {
		if (preparedStatement != null) {
			preparedStatement.close();
		}
		if (connection != null) {
			connection.close();
		}
		if (resultSet != null) {
			resultSet.close();
		}
		DriverManager.deregisterDriver(driver);
	}

}
