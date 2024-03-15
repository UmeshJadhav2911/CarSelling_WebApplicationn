package com.jspider.cardekhoservletandJDBC.login;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jspider.cardekhoservletandJDBC.JDBC.Services;
@WebServlet ("/login")
public class LogInPage extends HttpServlet {
	private static final long serialVersionUID = 1L;
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String username=req.getParameter("username");
		String password=req.getParameter("password");
		Boolean flag=Services.logIn(username,password);
		if(flag) {
			req.setAttribute("message", "<h1>WELCOME</h1>");
		}
		else {
			req.setAttribute("message", " <h1> INVALIED  </h1>");
		}
		
		RequestDispatcher requestDispatcher=req.getRequestDispatcher("StartApp.jsp");
		requestDispatcher.forward(req,resp);
	}

	

}
