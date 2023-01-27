package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection 
{
   public static Connection ConnectionInstance()
   {
	   String uname = "root";  // db username
	   String pass = "Test@9900"; // db password
	   String url = "jdbc:mysql://localhost:3306/jdbcdemo"; // db url
	   Connection con = null;
	   try
	   {
		   Class.forName("com.mysql.cj.jdbc.Driver");  // Load Driver
		   con = DriverManager.getConnection(url,uname, pass); // Get Connection
	   }
	   catch(Exception e)
	   {
		   System.out.println(e);
	   }
	   
	   return con;
   }
}
