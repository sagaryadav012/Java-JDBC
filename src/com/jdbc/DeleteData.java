package com.jdbc;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteData 
{
   public static void main(String args[])
   {
	   String query = "Delete from employee where empId = ?";
	   try {
		      PreparedStatement ps = DatabaseConnection.ConnectionInstance().prepareStatement(query);
		      ps.setInt(1, 559);
		      
		      int rows = ps.executeUpdate();
		      
		      System.out.println(rows+" row/s Deleted.");
	       } 
	   catch (SQLException e) 
		   {
			e.printStackTrace();
		   }
   }
}
