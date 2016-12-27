package com.web;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.service.RegisterService;
import com.service.ReloginService;
import com.service.impl.RegisterServiceImpl;
import com.service.impl.ReloginServiceImpl;

/**
 * Servlet implementation class RegisterServlet1
 */
public class ReloginServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ReloginServlet1() {
        super();
        // TODO Auto-generated constructor stub
    }
    
  

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name=request.getParameter("name");
		String Gen=request.getParameter("Gen");
		HttpSession session=request.getSession();
		
		
		ReloginService reg1= new ReloginServiceImpl();
		String result2 = reg1.Relogin(name,Gen);
		
	
		System.out.println(Gen);
		
		if(result2.equals("Relogin successful"))
		{
			/*HttpSession session=request.getSession();
			session.setAttribute("name",name);
			session.setAttribute("Gen", Gen);*/
			RequestDispatcher rd=request.getRequestDispatcher
					("/relogin.jsp");
			String Gen2="This is your coupon number    "+ Gen;
			request.setAttribute("result2",Gen2);	
			rd.include(request, response);
			
		}
		else
		{
		RequestDispatcher rd=request.getRequestDispatcher
				("/index_case.jsp");
		request.setAttribute("result2","Registration not successful");
		rd.include(request, response);
	}
		
		
	}}