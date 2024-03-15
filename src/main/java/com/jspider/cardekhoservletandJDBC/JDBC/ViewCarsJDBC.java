package com.jspider.cardekhoservletandJDBC.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.jspider.cardekhoservletandJDBC.object.Car;

import com.mysql.cj.jdbc.Driver;

public class ViewCarsJDBC {
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
	
	public static List<Car> searchAllCars() {
		List<Car> cars = new ArrayList<>();
		try {
			openConnection();
			query = "SELECT * FROM car";
			preparedStatement = connection.prepareStatement(query);
			resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				Car car = new Car();
				car.setId(resultSet.getInt(1));
				car.setName(resultSet.getString(2));
				car.setModel(resultSet.getString(3));
				car.setBrand(resultSet.getString(4));
				car.setPrice(resultSet.getDouble(5));
				car.setFuelType(resultSet.getString(6));
				car.setColour(resultSet.getString(7));
				cars.add(car);
			}
			try {
				closeConnection();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return cars;

	}

	

}
