package com.service.impl;

import com.dao.LoginDAO;
import com.dao.impl.LoginDAOImpl;
import com.service.LoginService;

public class LoginServiceImpl implements LoginService{

	public String validate(String name,String password){
		System.out.println(name);
		System.out.println(password);
		LoginDAO dao=new LoginDAOImpl();
		return dao.validate(name, password);
	}

}
