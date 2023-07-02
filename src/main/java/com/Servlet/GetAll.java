package com.Servlet;

import java.io.IOException;
import java.util.Vector;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.DBService.DBService;

@WebServlet("/getall")
public class GetAll extends HttpServlet {
	private static final long serialVersionUID = 1L;
      @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	// TODO Auto-generated method stub
    	
    	resp.sendRedirect(req.getContextPath()+"/getall.jsp");
    } 
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		Vector res=DBService.getall();
		String target="";
		if(res != null) {
			target="getall.jsp";
			HttpSession ses =request.getSession();
			ses.setAttribute("ses", res);
			request.setAttribute("list", res);
		}
		RequestDispatcher rd = request.getRequestDispatcher("/"+target);
		rd.forward(request, response);
		response.sendRedirect(request.getContextPath()+"/getall.jsp");
	}
	
	

}
