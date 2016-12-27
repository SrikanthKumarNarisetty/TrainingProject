package com.service.impl;

import java.util.List;

import com.dao.Doctor2DAO;
import com.dao.impl.Doctor2DAOImpl;
import com.io.Doctor2;
import com.service.Doctor2Service;

public class Doctor2ServiceImpl implements Doctor2Service {

	public List<Doctor2> Insert2(){
		Doctor2DAO doc2=new Doctor2DAOImpl();
		return doc2.Insert2();
		
	}

}
