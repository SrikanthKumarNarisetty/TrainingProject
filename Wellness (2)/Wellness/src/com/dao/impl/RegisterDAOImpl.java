package com.dao.impl;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;

import com.dao.RegisterDAO;

public class RegisterDAOImpl implements RegisterDAO {
	
	

	
	public String Register(String name, String age, String phone_number,
			 String address,String gender, String slot, String Gen) {
		// TODO Auto-generated method stub
		
		
	System.out.println(name+age+phone_number+address+gender+slot+Gen);
	
		
		String result1 ="";
		
		
		try {
			Connection con=DBHelper.connect();
			String sql="insert into patient_reg values(?,?,?,?,?,?,?)";
			PreparedStatement pst=con.prepareStatement(sql);
			pst.setString(1,name);
			pst.setString(2,age);
			pst.setString(3,phone_number);
			pst.setString(4,address);
			pst.setString(5,gender);
			pst.setString(6,slot);
			pst.setString(7,Gen);
			
			int rows= pst.executeUpdate();
			result1="Registration successful";
			System.out.println(result1);
			
			
			
			if(Gen.startsWith("0"))
			{
				
				
				String sql1="insert into doctor1 values(?,?,?,?,?,?,?)";
				PreparedStatement pst1=con.prepareStatement(sql1);
				pst1.setString(1,name);
				pst1.setString(2,age);
				pst1.setString(3,phone_number);
				pst1.setString(4,address);
				pst1.setString(5,gender);
				pst1.setString(6,slot);
				pst1.setString(7,Gen);
				
				int rows1= pst1.executeUpdate();
				
				
				
			}
			
			else if(Gen.startsWith("1"))
			{
				

				String sql2="insert into doctor2 values(?,?,?,?,?,?,?)";
				PreparedStatement pst2=con.prepareStatement(sql2);
				pst2.setString(1,name);
				pst2.setString(2,age);
				pst2.setString(3,phone_number);
				pst2.setString(4,address);
				pst2.setString(5,gender);
				pst2.setString(6,slot);
				pst2.setString(7,Gen);
				
				int rows1= pst2.executeUpdate();
				
			
			}
			
			else{
				
				
				String sql3="insert into doctor3 values(?,?,?,?,?,?,?)";
				PreparedStatement pst3=con.prepareStatement(sql3);
				pst3.setString(1,name);
				pst3.setString(2,age);
				pst3.setString(3,phone_number);
				pst3.setString(4,address);
				pst3.setString(5,gender);
				pst3.setString(6,slot);
				pst3.setString(7,Gen);
				
				int rows1= pst3.executeUpdate();
				
				
				
			}
			con.close();	
		}
			
			
			catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return result1;
		
		
		
	}


}
