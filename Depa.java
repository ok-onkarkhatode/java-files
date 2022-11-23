//5.department program

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
class Depa
{
	public static void main(String args[])throws Exception
	{ 
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/department","root","root");
		Depa d=new Depa();
		if(con!=null)
		{
			System.out.println("connection establish");
		}
		else
		{
			System.out.println("connection is not establish");
		}
	    Statement stmt=con.createStatement();
		ResultSet rs=stmt.executeQuery("Select * from department where dep_no=20");
		while(rs.next())
		{
			System.out.println("dep_no"  +  rs.getInt(1) + "dep_name"  +  rs.getString(2));
		}	
	}
}