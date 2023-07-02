package com.Servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/log")
public class AdminLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name= request.getParameter("name");
		String pass = request.getParameter("password");
		String target ="";
		if(name.equals("Arun")&&pass.equals("123")) {
			HttpSession session =request.getSession(false);
			  if(session!=null) {
				  session.invalidate();
			  }
			 session =request.getSession(true);
			 session.setAttribute("session","Welcome "+name);
				request.setAttribute("msg", "User Login successfully");

			target="admin-panel.jsp";
		}else {
			request.setAttribute("man", "Wroung Id And Password");
			target="admin_login.jsp";
		}
		RequestDispatcher rd = request.getRequestDispatcher("/"+target);
		rd.include(request, response);
	}

}
