package com.jdbc;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateData 
{
   public static void main(String args[])
   {
	   String query = "update employee set state = ?  where empId = ?";
	   
	   try {
		      PreparedStatement ps = DatabaseConnection.ConnectionInstance().prepareStatement(query);
		      ps.setString(1, "Kolkatta");
		      ps.setInt(2, 542);
		      
		      int rows = ps.executeUpdate();
		      
		      System.out.println(rows+" row/s updated.");
	       } 
	   catch (SQLException e) 
		   {
			e.printStackTrace();
		   }
   }
}
