package com.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBHelper {

	public static Connection connect() throws ClassNotFoundException, SQLException{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		System.out.println("driver loaded");
		return  DriverManager.getConnection("jdbc:oracle:thin:@hstslc015.mahindrasatyam.ad:1521:elp","ELITE1805","techM123$");
		

	}
}
