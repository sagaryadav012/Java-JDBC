package com.jdbc;

/*
 StudentService Class : To perform database operations 
 StudentDao Class : All database connection code written there
 Student Class : POJO class
*/
public class StudentService 
{
   public static void main(String args[]) throws Exception
   {
	   Student s = new Student();
	   s.setSid(199);
	   s.setName("Alien");
	   s.setMarks(999);
	   
	   StudentDao sd = new StudentDao();
	   
	   
//	   sd.InsertData(s);
	   
	   sd.FetchData();
	   
//	   sd.UpdateData(159, 832);
	   
//	   sd.DeleteData(120);
	   
	   
   }
}
