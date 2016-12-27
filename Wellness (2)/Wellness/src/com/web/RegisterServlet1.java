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
import com.service.impl.RegisterServiceImpl;

/**
 * Servlet implementation class RegisterServlet1
 */
public class RegisterServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterServlet1() {
        super();
        // TODO Auto-generated constructor stub
    }
    int i=1;
  int count=10;
  

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name=request.getParameter("name");
		String age=request.getParameter("age");
		String phone_number=request.getParameter("phone_number");
		String address=request.getParameter("address");
		String gender=request.getParameter("gender");
		String slot=request.getParameter("slot");
		 
		
		DateFormat dateFormat = new SimpleDateFormat("ddMMyyyy");
		java.util.Date date = new java.util.Date();
		
		int a = i%3;
		
		System.out.println(i);
		String Gen=a+dateFormat.format(date)+slot+count;/*coupon no*/
		System.out.println(Gen);
		i++;
		count++;
		
		RegisterService reg= new RegisterServiceImpl();
		String result1 = reg.Register(name,age,phone_number,address,gender,slot,Gen);
		
		
		
		if(result1.equals("Registration successful"))
		{
			HttpSession session=request.getSession();
			session.setAttribute("name",name);
			session.setAttribute("Gen", Gen);
			RequestDispatcher rd=request.getRequestDispatcher
					("/Patient.jsp");
			String Gen1="This is your coupon number    "+ Gen;
			request.setAttribute("result1",Gen1);	
			rd.include(request, response);
			
		}
		else
		{
		RequestDispatcher rd=request.getRequestDispatcher
				("/index_case.jsp");
		request.setAttribute("result1","Registration not successful");
		rd.include(request, response);
	}
		
		
		
		

}
}