package com.Servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.DBService.DBService;
import com.DTO.user;

@WebServlet("/regi")
public class register extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		user u = new user();
		u.setName(request.getParameter("name"));
		u.setPassword(request.getParameter("pwd"));
		u.setAddress(request.getParameter("street"));
		u.setEmail(request.getParameter("email"));
		u.setContect(request.getParameter("pno"));
		u.setCountry(request.getParameter("country"));
		u.setState(request.getParameter("state"));
		
		boolean res = DBService.registration(u);
		String target="";
		if(res) {
			
			request.setAttribute("msg", "User Registeration successfully");

			 target="plogin.jsp";
			
		}else {
			 request.setAttribute("msg", "UserId and Password Wroung");
		}
		RequestDispatcher rd = request.getRequestDispatcher("/"+target);
		rd.forward(request, response);
		
	}

}
