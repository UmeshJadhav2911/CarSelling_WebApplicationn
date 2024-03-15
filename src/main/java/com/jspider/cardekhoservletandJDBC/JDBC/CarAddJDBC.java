package com.jspider.cardekhoservletandJDBC.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.jdbc.Driver;

public class CarAddJDBC {
	private static Connection connection;
	private static PreparedStatement preparedStatement;
	private static ResultSet resultSet;
	private static String query;
	private static Driver driver;
	
	private static void openConnection() throws SQLException {
		driver=new com.mysql.cj.jdbc.Driver();
		connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/weja4","root","root");
	}
	
	private static void closeConnection() throws Exception{
		if(preparedStatement!=null) {
			preparedStatement.close();
		}
		if(connection!=null) {
			connection.close();
		}
		if (resultSet!= null) {
			resultSet.close();
		}
		DriverManager.deregisterDriver(driver);
	}

	public static int addCar(int id, String name, String model, String brand, double price, String fuel, String colour) {
		int res = 0;
		try {
			openConnection();
			query="insert into car values(?,?,?,?,?,?,?)";
			preparedStatement=connection.prepareStatement(query);
			preparedStatement.setInt(1, id);
			preparedStatement.setString(2, name);
			preparedStatement.setString(3, model);
			preparedStatement.setString(4, brand);
			preparedStatement.setDouble(5, price);
			preparedStatement.setString(6, fuel);
			preparedStatement.setString(7, colour);
			
			res=preparedStatement.executeUpdate();
			System.out.println(res + "row(s)affected");
			closeConnection();
			
		} catch (Exception e) {
		e.printStackTrace();
		}
		return res;
		
	}
	


}
