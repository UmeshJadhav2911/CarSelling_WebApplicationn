package com.jspider.cardekhoservletandJDBC.UpdateServlet;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jspider.cardekhoservletandJDBC.JDBC.UpdateCarJDBC;
@WebServlet("/UpdateColor")
public class UpdateCarColor extends HttpServlet {
		private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String color=req.getParameter("color");
		int id=Integer.parseInt(req.getParameter("id"));
		int res = UpdateCarJDBC.updateColor(color,id);
		if(res==1) {
			req.setAttribute("message", "<h1> CAR IS UPDATED </h1>");
		}
		else {
			req.setAttribute("message", " <h1> CAR IS NOT UPDATED </h1>");
		}
		RequestDispatcher requestDispatcher = req.getRequestDispatcher("UpdateCar.jsp");
		requestDispatcher.forward(req, resp);
	}

}
