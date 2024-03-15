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

public class SearchCar {
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
	
	public static List<Car> searchAllCars(int id) {
		List<Car> cars = new ArrayList<>();
		try {
			openConnection();
			query = "SELECT * FROM car where id=?";
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setInt(1,id);
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
				
				e.printStackTrace();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return cars;

	}
	
	public static List<Car> searchAllCars(String name) {
		List<Car> cars = new ArrayList<>();
		try {
			openConnection();
			query = "SELECT * FROM car where name=?";
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1,name);
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
				
				e.printStackTrace();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return cars;
	}
	
	public static List<Car> searchAllCars1(String model) {
		List<Car> cars = new ArrayList<>();
		try {
			openConnection();
			query = "SELECT * FROM car where Model=?";
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1,model);
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
				
				e.printStackTrace();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return cars;
	}
	
	public static List<Car> searchAllCars2(String brand) {
		List<Car> cars = new ArrayList<>();
		try {
			openConnection();
			query = "SELECT * FROM car where Brand=?";
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1,brand);
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
				e.printStackTrace();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return cars;
	}
	
	public static List<Car> searchAllCars3(String fuel) {
		List<Car> cars = new ArrayList<>();
		try {
			openConnection();
			query = "SELECT * FROM car where FuelType=?";
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1,fuel);
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
				
				e.printStackTrace();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return cars;
	}

	public static List<Car> searchAllCars4(String color) {
		List<Car> cars = new ArrayList<>();
		try {
			openConnection();
			query = "SELECT * FROM car where Colour=?";
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1,color);
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
				
				e.printStackTrace();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return cars;	
	}

	public static List<Car> searchAllCars5(int min, int max) {
		List<Car> cars = new ArrayList<>();
		try {
			openConnection();
			query = "select * from car where Price between ? and ?";
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setInt(1,min);
			preparedStatement.setInt(1,max);
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
				
				e.printStackTrace();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return cars;	
	}


	public static int DeleteCar(int id) {
		int res = 0;
		try {
			openConnection();
			query = "Delete FROM car where id=?";
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setInt(1,id);
			res = preparedStatement.executeUpdate();
			try {
				closeConnection();
			} catch (Exception e) {
				e.printStackTrace();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return res;		
	}

	


}
