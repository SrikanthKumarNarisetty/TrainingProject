package com.service.impl;

import java.util.List;

import com.dao.Doctor3DAO;
import com.dao.impl.Doctor3DAOImpl;
import com.io.Doctor3;
import com.service.Doctor3Service;

public class Doctor3ServiceImpl implements Doctor3Service {

	public List<Doctor3> Insert3(){
		Doctor3DAO doc3=new Doctor3DAOImpl();
		return doc3.Insert3();
		
	}

}
