package com.jspider.cardekhoservletandJDBC.login;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.jspider.cardekhoservletandJDBC.JDBC.SearchCar;

@WebServlet("/deletecar")
public class DeleteCar extends HttpServlet{
private static final long serialVersionUID = 1L;
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int id=Integer.parseInt(req.getParameter("id"));
		int res = SearchCar.DeleteCar(id);
		if(res==1) {
			req.setAttribute("message", "<h1> CAR IS DELETED </h1>");
		}
		else {
			req.setAttribute("message", " <h1> CAR IS NOT FOUND </h1>");
		}
		RequestDispatcher requestDispatcher = req.getRequestDispatcher("Delete.jsp");
		requestDispatcher.forward(req, resp);
	}
}
