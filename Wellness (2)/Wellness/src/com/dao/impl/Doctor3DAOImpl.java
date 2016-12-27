package com.dao.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.dao.Doctor3DAO;
import com.io.Doctor3;

public class Doctor3DAOImpl implements Doctor3DAO {
	public  List<Doctor3> Insert3(){
		
		Doctor3 doc3=new Doctor3();
		List<Doctor3> list=null;
		
		
		
	try {



		Connection con=DBHelper.connect();

		String sql="select * from doctor3";
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(sql);
		
		
		list=new ArrayList<Doctor3>();
		
		while(rs.next()){
		doc3=new Doctor3();
		
			doc3.setName(rs.getString(1));
			doc3.setAge(rs.getString(2));
			doc3.setPhone_number(rs.getString(3));
			doc3.setAddress(rs.getString(4));
			doc3.setGender(rs.getString(5));
			doc3.setSlot(rs.getString(6));
			doc3.setGen(rs.getString(7));
			list.add(doc3);
		}
		con.close();
		
		
		
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
	

	
	
	return list;
	
	
	}
}
