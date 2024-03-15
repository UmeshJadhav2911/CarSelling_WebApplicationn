package com.jspider.cardekhoservletandJDBC.UpdateServlet;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jspider.cardekhoservletandJDBC.JDBC.UpdateCarJDBC;
@WebServlet("/UpdateModel")
public class UpdateCarModel extends HttpServlet {
private static final long serialVersionUID = 1L;
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String model =req.getParameter("model");
		int id=Integer.parseInt(req.getParameter("id"));
		int res = UpdateCarJDBC.updateModel(model,id);
		if(res==1) {
			req.setAttribute("message", "<h1> CAR IS ADDED </h1>");
		}
		else {
			req.setAttribute("message", " <h1> CAR IS NOT ADDED </h1>");
		}
		RequestDispatcher requestDispatcher = req.getRequestDispatcher("UpdateCar.jsp");
		requestDispatcher.forward(req, resp);
	}

}
