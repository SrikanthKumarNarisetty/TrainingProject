package com.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.dao.LoginDAO;

public class LoginDAOImpl implements LoginDAO {

	public String validate(String name,String password){
		
		String result="";
		try {
			Connection con=DBHelper.connect();
			
			String sql="select * from login_doc where name=? and password=?";
			
			PreparedStatement pst=con.prepareStatement(sql);
			
			pst.setString(1,name);
			pst.setString(2,password);
			System.out.println("hi");
			//System.out.println(pst.toString());
			ResultSet rs=pst.executeQuery();
			System.out.println("hi");
			if(rs.next())
			
			{
				
				System.out.println("in result set");
				result="VALID";
				
			}
			
			else{
				System.out.println("in else rs");
				
				
			}
		
			con.close();
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
	
	

	}


