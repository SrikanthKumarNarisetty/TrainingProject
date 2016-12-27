package com.service.impl;

import java.util.List;

import com.dao.Doctor1DAO;
import com.dao.impl.Doctor1DAOImpl;
import com.io.Doctor1;
import com.service.Doctor1Service;

public class Doctor1ServiceImpl implements Doctor1Service {

	public List<Doctor1> Insert(){
		Doctor1DAO doc1=new Doctor1DAOImpl();
		return doc1.Insert();
		
	}

}
