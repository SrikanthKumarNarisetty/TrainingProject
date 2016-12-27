package com.web;

import java.io.IOException;

import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.io.Doctor3;
import com.service.Doctor3Service;
import com.service.impl.Doctor3ServiceImpl;

public class Doctor3Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public Doctor3Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		Doctor3Service d3=new Doctor3ServiceImpl();
		List<Doctor3> list=d3.Insert3();
		RequestDispatcher rd=request.getRequestDispatcher
				("/doctor3_display.jsp");
		request.setAttribute("list",list);
		rd.forward(request, response);
		
	}
}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		