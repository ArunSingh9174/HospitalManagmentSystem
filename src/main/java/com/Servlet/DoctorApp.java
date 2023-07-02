
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



@WebServlet("/Docapp")
public class DoctorApp extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String target="";
		String dr = request.getParameter("doctor");
		String ti=request.getParameter("time");
		
		HttpSession ses =request.getSession();
		String email =(String) ses.getAttribute("user");
		
		boolean res = DBService.docapp(dr,ti,email);
		
		if(res) {
			target ="thank.jsp";
		}
		RequestDispatcher rd = request.getRequestDispatcher("/"+target);
		rd.include(request, response);
		
	}

}
