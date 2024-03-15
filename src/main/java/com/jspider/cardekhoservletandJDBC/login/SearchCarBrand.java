package com.jspider.cardekhoservletandJDBC.login;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jspider.cardekhoservletandJDBC.JDBC.SearchCar;
import com.jspider.cardekhoservletandJDBC.object.Car;
@WebServlet("/SearchBrand")
public class SearchCarBrand extends HttpServlet {
private static final long serialVersionUID = 1L;
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String brand=req.getParameter("brand");
		List<Car> cars = SearchCar.searchAllCars2(brand);
		req.setAttribute("cars", cars);
		RequestDispatcher requestDispatcher = req.getRequestDispatcher("SearchCar.jsp");
		requestDispatcher.forward(req, resp);
	}

}
