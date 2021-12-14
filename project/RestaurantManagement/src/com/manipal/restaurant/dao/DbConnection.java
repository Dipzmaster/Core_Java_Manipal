package com.manipal.restaurant.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {
public static Connection getConnection()
{
	try
	{
	Class.forName("oracle.jdbc.driver.OracleDriver");
	
	Connection con= DriverManager.getConnection(
			"jdbc:oracle:thin:@localhost:1521:XE", "system",
			"system");
	return con;
	}
	catch(ClassNotFoundException e)
	{
		System.out.println(e);
	}
	catch(SQLException e)
	{
		System.out.println(e);
	}
	return null;
}
}
