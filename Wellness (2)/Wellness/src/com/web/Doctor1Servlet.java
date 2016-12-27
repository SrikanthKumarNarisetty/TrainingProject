package com.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.io.Doctor1;
import com.service.Doctor1Service;
import com.service.impl.Doctor1ServiceImpl;

public class Doctor1Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public Doctor1Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		Doctor1Service d1=new Doctor1ServiceImpl();
		List<Doctor1> list=d1.Insert();
		RequestDispatcher rd=request.getRequestDispatcher
				("/doctor1_display.jsp");
		request.setAttribute("list",list);
		rd.forward(request, response);
		
	}
}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		