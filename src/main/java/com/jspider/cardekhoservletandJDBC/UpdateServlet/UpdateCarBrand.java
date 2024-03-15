package com.jspider.cardekhoservletandJDBC.UpdateServlet;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jspider.cardekhoservletandJDBC.JDBC.UpdateCarJDBC;
@WebServlet("/UpdateBrand")
public class UpdateCarBrand extends HttpServlet {
private static final long serialVersionUID = 1L;
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String brand=req.getParameter("brand");
		int id=Integer.parseInt(req.getParameter("id"));
		int res = UpdateCarJDBC.updateBrand(brand,id);
		
		RequestDispatcher requestDispatcher = req.getRequestDispatcher("UpdateCar.jsp");
		requestDispatcher.forward(req, resp);
	}

}
