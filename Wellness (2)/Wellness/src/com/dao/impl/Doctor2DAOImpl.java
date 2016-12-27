package com.dao.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.dao.Doctor2DAO;
import com.io.Doctor2;

	public class Doctor2DAOImpl implements Doctor2DAO {
	public  List<Doctor2> Insert2(){
		
		Doctor2 doc2=new Doctor2();
		List<Doctor2> list=null;
		
	try {

		Connection con=DBHelper.connect();
		String sql="select * from doctor2";
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(sql);
		list=new ArrayList<Doctor2>();
		
		while(rs.next()){
		doc2=new Doctor2();
		
			doc2.setName(rs.getString(1));
			doc2.setAge(rs.getString(2));
			doc2.setPhone_number(rs.getString(3));
			doc2.setAddress(rs.getString(4));
			doc2.setGender(rs.getString(5));
			doc2.setSlot(rs.getString(6));
			doc2.setGen(rs.getString(7));
			list.add(doc2);
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
