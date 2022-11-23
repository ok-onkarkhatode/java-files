/*
import java.sql.Connection;
import java.sql.DriverManager;
class Demo
{
  public static void main(String args[]) throws Exception
  {
     Class.forName("com.mysql.cj.jdbc.Driver");
     Connection con=new DriverManager.getConnection("jdbc:mysql:/localhost:3306/demo","root","root");
    if(con !=null)
     {
	   System.out.println("jdbc connection establish");  
     }
     else
     {
	 System.out.println("jdbc connection not establish");
     }
	  
  }
}
*/

/*
import java.sql.*; 
import java.sql.Connection;
import java.sql.DriverManager; 
class Demo
{ 
 
   public static void main(String args[])throws Exception
   {  

     Class.forName("com.mysql.cj.jdbc.Driver");  
     Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","root");  
     Demo d=new Demo();
	if(con!=null)
	 {
		 System.out.println("Connection established...!");
	 }
	 else
	 {
		 System.out.println("connection is not established..!");
	 }
	
	 Statement stmt=con.createStatement();
	 ResultSet rs=stmt.executeQuery("select * from actor");
	 System.out.println(rs);
	 while(rs.next())
	 {
		 System.out.println("no: "+rs.getInt(1)+"first name: "+rs.getString(2));
		 System.out.println("While loop executed...");
	 }
   }
}
*/

/*
// 2.highest salary of employee
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
class Demo
{
	public static void main(String args[])throws Exception
	{ 
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","root");
	    
		Demo d=new Demo();
		if(con!=null)
		{
			System.out.println("connection establish");
		}
		else
		{
			System.out.println("connection is not establish");
		}
		Statement stmt=con.createStatement();
		ResultSet rs=stmt.executeQuery("Select * from employee where emp_Salary=(Select MAX(emp_Salary) from employee) ");
		while(rs.next())
		{
			System.out.println("emo_id "  +  rs.getInt(1) + "emp_name"  +  rs.getString(2)  +  "emp_salary"  +  rs.getFloat(3));
			System.out.println("While loop executed...");

		}
	}
}
*/

/*
//1.employee initial character
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
class Demo
{
	public static void main(String args[])throws Exception
	{ 
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","root");
	     Demo d=new Demo();
		if(con!=null)
		{
			System.out.println("connection establish");
		}
		else
		{
			System.out.println("connection is not establish");
		}
		Statement stmt=con.createStatement();
		ResultSet rs=stmt.executeQuery("Select * from employee where emp_name like 'onkar'");
		while(rs.next())
		{
			System.out.println("emo_id "  + rs.getInt(1) +"  "+"emp_name"  + rs.getString(2)  +  "  "+ "emp_salary"  +  rs.getFloat(3));
			System.out.println("While loop executed...");
		}
	}
}
*/

/*
//3.count student records
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
class Demo
{
	public static void main(String args[])throws Exception
	{ 
	    int count=0;
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","root");
		Demo d=new Demo();
		
		if(con!=null)
		{
			System.out.println("connection establish");
		}
		else
		{
			System.out.println("connection is not establish");
		}
	    Statement stmt=con.createStatement();
		ResultSet rs=stmt.executeQuery("select * from student");
		while(rs.next())
		{
		   count++;
		  // System.out.println("total records is:"+count);
		}
		System.out.println("total records is:"+count);
			
		
		
	}
}
*/

/*
//5.delete city
  
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
class Demo
{
	public static void main(String args[])throws Exception
	{ 
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","root");
		Demo d=new Demo();
		if(con!=null)
		{
			System.out.println("connection establish");
		}
		else
		{
			System.out.println("connection is not establish");
		}
	    Statement stmt=con.createStatement();
		stmt.executeUpdate("Delete from student where s_city='nashik'");
		ResultSet rs=stmt.executeQuery("select * from student");
		while(rs.next())
		{
			System.out.println("s_id "  +  rs.getInt(1) + "s_name"  +  rs.getString(2)  +  "s_city"  +  rs.getString(3));
		}
	}
}
*/


