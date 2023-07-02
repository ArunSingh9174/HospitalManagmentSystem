package com.Servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.DBService.DBService;


@WebServlet("/login")
public class UserLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email=request.getParameter("email");
		String password = request.getParameter("password");
		
		boolean res =DBService.login(email,password);
		String target="";
		if(res) {
			target="DoctorList.jsp";
			HttpSession session = request.getSession(true);
			session.setAttribute("user", email);
		}
		RequestDispatcher rd = request.getRequestDispatcher("/"+target);
		rd.forward(request, response);
	}

}
