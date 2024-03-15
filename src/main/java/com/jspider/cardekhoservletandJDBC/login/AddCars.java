package com.jspider.cardekhoservletandJDBC.login;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jspider.cardekhoservletandJDBC.JDBC.CarAddJDBC;
@WebServlet("/AddCar")
public class AddCars extends HttpServlet {

	private static final long serialVersionUID = 1L;
		
		@Override
		protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			int id=Integer.parseInt(req.getParameter("id"));
			String name=req.getParameter("name");
			String model=req.getParameter("model");
			String brand=req.getParameter("brand");
			double price=Double.parseDouble(req.getParameter("price"));
			String fuel=req.getParameter("fuel");
			String colour=req.getParameter("colour");
			int res=CarAddJDBC.addCar(id,name,model,brand,price, fuel, colour);
			if(res==1) {
				req.setAttribute("message", "<h1> CAR IS ADDED </h1>");
			}
			else {
				req.setAttribute("message", " <h1> CAR IS NOT ADDED </h1>");
			}
			
			RequestDispatcher requestDispatcher=req.getRequestDispatcher("AddCar.jsp");
			requestDispatcher.forward(req,resp);
		}
		

	


}
