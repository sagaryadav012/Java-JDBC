package com.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentDao 
{
  private Connection con = DatabaseConnection.ConnectionInstance();
  private Statement st = null;
  private PreparedStatement ps = null;
   
   public void InsertData(Student s) throws Exception
   {
	  String query = "insert into student values(?,?,?)";
	  ps = con.prepareStatement(query);
	  ps.setInt(1, s.getSid());
	  ps.setString(2, s.getName());
	  ps.setInt(3, s.getMarks());
	  
	  int rows = ps.executeUpdate();
	  
	  System.out.println(rows+" row/s Inserted.");
	  
   }
   
   public void FetchData() throws Exception
   {
	   String query = "select * from student";
	   st = con.createStatement();
	   ResultSet rs = st.executeQuery(query);
	   
	   while(rs.next())
		   System.out.println(rs.getInt(1)+" : "+rs.getString(2)+" : "+rs.getInt(3));
   }
   
   public void UpdateData(int id, int marks) throws Exception
   {
	   String query = "update student set marks = ?  where sid = ?";
	   ps = DatabaseConnection.ConnectionInstance().prepareStatement(query);
	   ps.setInt(1, marks);
	   ps.setInt(2, id);
	      
	   int rows = ps.executeUpdate(); 
	   System.out.println(rows+" row/s Updated.");
   }
   public void DeleteData(int id) throws Exception
   {
	   String query = "Delete from student where sid = ?";
	   ps = DatabaseConnection.ConnectionInstance().prepareStatement(query);
	   ps.setInt(1, id);
	      
	   int rows = ps.executeUpdate(); 
	   System.out.println(rows+" row/s Deleted.");
   }
}
