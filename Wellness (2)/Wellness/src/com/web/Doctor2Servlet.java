package com.web;

import java.io.IOException;

import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.io.Doctor2;
import com.service.Doctor2Service;
import com.service.impl.Doctor2ServiceImpl;

public class Doctor2Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public Doctor2Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		Doctor2Service d1=new Doctor2ServiceImpl();
		List<Doctor2> list=d1.Insert2();
		RequestDispatcher rd=request.getRequestDispatcher
				("/doctor2_display.jsp");
		request.setAttribute("list",list);
		rd.forward(request, response);
		
	}
}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		