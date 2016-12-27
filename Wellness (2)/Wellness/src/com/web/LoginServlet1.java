 package com.web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.service.LoginService;
import com.service.impl.LoginServiceImpl;

public class LoginServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public LoginServlet1() {
        super();
        
    }

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String name = request.getParameter("name");
		String password= request.getParameter("password");
		LoginService ds = new LoginServiceImpl();
		String result = ds.validate(name, password);
		
		if(name.equals("recep"))
		{
        String recep=request.getParameter("name");
		String passw=request.getParameter("password");
		HttpSession session4=request.getSession();
		 session4.setAttribute("receptionist", name);
		 RequestDispatcher rd4=request.getRequestDispatcher("./Recep.jsp");
		 rd4.forward(request, response);
		}
		 
		else if(name.equals("doctor1"))
		 {
			HttpSession session1=request.getSession();
			 System.out.println("doc1");
			 session1.setAttribute("doctor1", name);
			 RequestDispatcher rd1=request.getRequestDispatcher("./Doctor1Servlet");
			 rd1.include(request, response);
		 }
		else if(name.equals("doctor2"))
		{
			 HttpSession session2=request.getSession();
			 System.out.println("doc2");
			 session2.setAttribute("doctor2", name);
			 RequestDispatcher rd2=request.getRequestDispatcher("./Doctor2Servlet");
			 rd2.include(request, response);
		}
		else if(name.equals("doctor3"))
		{
			 HttpSession session3=request.getSession();
			 System.out.println("doc3");
			 session3.setAttribute("doctor3", name);
			 RequestDispatcher rd3=request.getRequestDispatcher("./Doctor3Servlet");
			 rd3.include(request, response);
		} 
			/* case "recep":  HttpSession session4=request.getSession();
			 session4.setAttribute("receptionist", name);
			 RequestDispatcher rd4=request.getRequestDispatcher("./Recep.jsp");
			 rd4.forward(request, response);  */
			 
             
		
		else
		{
		RequestDispatcher rd=request.getRequestDispatcher
				("/index_case.jsp");
		request.setAttribute("result","INVALID USER");
		rd.include(request, response);
		}
		 
	}
	
}
