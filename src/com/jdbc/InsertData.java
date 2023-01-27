package com.jdbc;

import java.sql.PreparedStatement;
import java.sql.SQLException;

/*
	The PreparedStatement interface is a subinterface of Statement. 
	It is used to execute parameterized query.
*/
public class InsertData 
{
   public static void main(String args[])
   {
	   String query = "insert into employee values(?,?,?,?)";
	   try {
		     PreparedStatement ps = DatabaseConnection.ConnectionInstance().prepareStatement(query);
		     ps.setInt(1, 525);
		     ps.setString(2, "Aravind");
		     ps.setString(3, "Noida");
		     ps.setString(4, "Delhi");
		     
		     int rows = ps.executeUpdate();
		     
		     System.out.println(rows+" row/s Inserted");
		     
	       } catch (SQLException e) 
		   {
			e.printStackTrace();
		   }
	   
   }
}
