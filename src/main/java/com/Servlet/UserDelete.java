package com.Servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.DBService.DBService;


@WebServlet("/delete")
public class UserDelete extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String email=request.getParameter("email");
		
		boolean res = DBService.delete(email);
		String target="";
		if(res) {
			
			request.setAttribute("msg", "User Delete  successfully");

			 target="deleteuser.jsp";
			
		}else {
			 request.setAttribute("msg", "  User not Delete ");
		}
		RequestDispatcher rd = request.getRequestDispatcher("/"+target);
		rd.forward(request, response);
		
	}

}
