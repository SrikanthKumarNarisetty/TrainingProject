package com.dao.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.dao.Doctor1DAO;
import com.io.Doctor1;

public class Doctor1DAOImpl implements Doctor1DAO {
	public  List<Doctor1> Insert(){
		
		Doctor1 doc1=new Doctor1();
		List<Doctor1> list=null;
		
	try {
		
		Connection con=DBHelper.connect();

		String sql="select * from doctor1";
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(sql);
		
		list=new ArrayList<Doctor1>();
		
		while(rs.next()){
		doc1=new Doctor1();
		
			doc1.setName(rs.getString(1));
			doc1.setAge(rs.getString(2));
			doc1.setPhone_number(rs.getString(3));
			doc1.setAddress(rs.getString(4));
			doc1.setGender(rs.getString(5));
			doc1.setSlot(rs.getString(6));
			doc1.setGen(rs.getString(7));
			list.add(doc1);
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
