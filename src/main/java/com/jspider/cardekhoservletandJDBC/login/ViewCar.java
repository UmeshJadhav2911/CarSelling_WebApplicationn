package com.jspider.cardekhoservletandJDBC.login;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.jspider.cardekhoservletandJDBC.object.Car;
import com.jspider.cardekhoservletandJDBC.JDBC.ViewCarsJDBC;

public class ViewCar extends HttpServlet{
	
	private static final long serialVersionUID = 1L;
	

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		List<Car> cars = ViewCarsJDBC.searchAllCars();
		req.setAttribute("cars", cars);
		RequestDispatcher requestDispatcher = req.getRequestDispatcher("ViewCar.jsp");
		requestDispatcher.forward(req, resp);
	}


}
