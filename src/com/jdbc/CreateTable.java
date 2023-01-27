package com.jdbc;

import java.sql.SQLException;
import java.sql.Statement;

/*
	The Statement interface provides methods to execute queries with the database. 
	The statement interface is a factory of ResultSet i.e. 
	it provides factory method to get the object of ResultSet.
	
	Methods provided by Statement interface :
	   public ResultSet executeQuery(String sql)
	   public int executeUpdate(String sql)
	   public boolean execute(String sql)
	   public int[] executeBatch()
*/

public class CreateTable 
{
   public static void main(String args[])
   {
	   Statement st = null;
	   String query = "Create table Employee"+"(empId int not null,"+"empName varchar(60),"+
                        "city varchar(60),"+"state varchar(60))";
	   try {
		      st = DatabaseConnection.ConnectionInstance().createStatement();
		      int rows =  st.executeUpdate(query);
		      
		      System.out.println(rows+ " row/s effected");
	       } 
	   catch (SQLException e) 
	   {
	    	e.printStackTrace();
	   }
	   
   }
}
