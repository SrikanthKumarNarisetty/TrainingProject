package com.service.impl;


import com.dao.ReloginDAO;

import com.dao.impl.ReloginDAOImpl;
import com.service.ReloginService;

public class ReloginServiceImpl implements ReloginService {
	
	@Override
	public String Relogin(String name, String Gen) {
		ReloginDAO log=new ReloginDAOImpl();
		
	
	return log.Relogin(name, Gen);

	
	
	}
	
	
	

}
