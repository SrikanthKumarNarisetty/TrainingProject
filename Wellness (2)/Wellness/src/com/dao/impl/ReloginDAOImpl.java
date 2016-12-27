package com.dao.impl;

import java.sql.Connection;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;

import com.dao.RegisterDAO;
import com.dao.ReloginDAO;

public class ReloginDAOImpl implements ReloginDAO{
	public String Relogin(String name,String Gen) {
		// TODO Auto-generated method stub
		
		
	System.out.println(name+Gen);
	
		
		String result2 ="";
		
		
		try{
		
		
			Connection con=DBHelper.connect();
			String sql="insert into relogin values(?,?)";
			PreparedStatement pst=con.prepareStatement(sql);
			pst.setString(1,name);
			pst.setString(2,Gen);
			
			int rows= pst.executeUpdate();
			result2="Relogin successful";
			System.out.println(result2);
			
			
			
		
	
		con.close();
	}
		catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch(SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result2;
	
	
	}
	
		
		}

