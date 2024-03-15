package com.jspider.cardekhoservletandJDBC.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.mysql.cj.jdbc.Driver;

public class UpdateCarJDBC {
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

	

	public static int updateName(String name, int id) {
		int res=0;
		try {
			openConnection();
			query =" update car set name=? where id=?";
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1,name);
			preparedStatement.setInt(2, id);
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

	public static int updateModel(String model, int id) {
		int res=0;
		try {
			openConnection();
			query =" update car set model=? where id=?";
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1,model);
			preparedStatement.setInt(2, id);
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

	public static int updateBrand(String brand, int id) {
		int res=0;
		try {
			openConnection();
			query =" update car set brand=? where id=?";
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1,brand);
			preparedStatement.setInt(2, id);
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

	public static int updatePrice(int price, int id) {
		int res=0;
		try {
			openConnection();
			query =" update car set Price=? where id=?";
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setInt(1,price);
			preparedStatement.setInt(2, id);
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

	public static int updateFuel(String fuel, int id) {
		int res=0;
		try {
			openConnection();
			query =" update car set FuelType=? where id=?";
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1,fuel);
			preparedStatement.setInt(2, id);
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

	public static int updateColor(String color, int id) {
		int res=0;
		try {
			openConnection();
			query =" update car set Colour=? where id=?";
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1,color);
			preparedStatement.setInt(2, id);
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
