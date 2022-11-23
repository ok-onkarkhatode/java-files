import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;
import java.sql.ResultSet;
import java.io.*;
import java.sql.*;

class Scroll
{
	public static void main(String args[])throws Exception
	{ 
	    
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/technorbit", "root", "root");
		
		if(con!=null)
		{
			System.out.println("connection establish");
		}
		else
		{
			System.out.println("connection is not establish");
		}
		
		
		
		
		Statement stmt=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
		ResultSet rs=stmt.executeQuery("select * from technorbit");
		
	   rs.next();
		
	   rs.first();  
		System.out.println("name: "  +  rs.getString(1) + "\t" + "hours:" + "\t" +  rs.getInt(2) );
	
		rs.last();
		System.out.println("name: "  +  rs.getString(1) + "\t" + "hours:" + "\t" +  rs.getInt(2) );
		
		rs.isFirst();
		System.out.println("name: "  +  rs.getString(1) + "\t" + "hours:" + "\t" +  rs.getInt(2) );
		
		rs.isLast();
		System.out.println("name: "  +  rs.getString(1) + "\t" + "hours:" + "\t" +  rs.getInt(2) );
		
		rs.isBeforeFirst();
		System.out.println("name: "  +  rs.getString(1) + "\t" + "hours:" + "\t" +  rs.getInt(2) );
		
		}
}