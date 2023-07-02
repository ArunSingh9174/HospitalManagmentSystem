package com.Servlet;

import java.io.IOException;
import java.util.Vector;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.DBService.DBService;

@WebServlet("/showapo")
public class ShowAppointment extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Vector res=DBService.showapo();
		String target="";
		if(res != null) {
			target="ShowApo.jsp";
			request.setAttribute("list", res);
		}
		RequestDispatcher rd = request.getRequestDispatcher("/"+target);
		rd.forward(request, response);

	}

	}


