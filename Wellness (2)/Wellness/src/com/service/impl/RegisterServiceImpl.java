package com.service.impl;


import com.dao.RegisterDAO;

import com.dao.impl.RegisterDAOImpl;
import com.service.RegisterService;

public class RegisterServiceImpl implements RegisterService {
	
	@Override
	public String Register(String name, String age, String phone_number,
			 String address,String gender, String slot, String Gen) {	
	RegisterDAO login =new RegisterDAOImpl();
	return login.Register(name,age,phone_number,address,gender,slot, Gen);

	
	
	}
	
	
	

}
