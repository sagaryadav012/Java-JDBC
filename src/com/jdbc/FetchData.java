package com.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class FetchData 
{
   public static void main(String args[])
   {
	   String query = "select * from employee";
	   try {
		     Statement st = DatabaseConnection.ConnectionInstance().createStatement();
		     ResultSet rs = st.executeQuery(query);
		     
				/*
				 * initially ResultSet points to before 1st row. so we use next() method to move
				 * pointer to next Row. And rs.next() returns boolean, if rs has next row return
				 * true else return false.
				 * 
				 * And rs.getInt(1) here 1 is column index like 1st column, 2nd column....
				 * 
				 */
		     
		     while(rs.next())  
		     {
		        System.out.println(rs.getInt(1)+" : "+rs.getString(2)+" : "+
		                           rs.getString(3)+" : "+rs.getString(4));
		     }
		     
	       } 
	   catch (SQLException e) 
	   {
		  e.printStackTrace();
	   }
   }
}
