/*
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.io.InputStream;
import java.io.FileInputStream;

class Image
{
	static Connection conn = null;
	static PreparedStatement ps = null;
	static String query1 = "insert into image values(?,?)";
	
	public static void main(String args[]) 
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/technorbit", "root", "root");
			
			if(conn == null)
			{
				System.out.println("Connection NOT Establish....");
			}
			else
			{
				System.out.println("Conection Establish....");
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		try
		{
			ps = conn.prepareStatement(query1);
			
			InputStream is = new FileInputStream("D:/programs/jdbc/Image.jpeg");
		
			ps.setInt(1, 1);
			ps.setBlob(2, is);
			
			int row = ps.executeUpdate();
			System.out.println(row);
		
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
*/



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.io.InputStream;
import java.io.FileInputStream;


class Image
{
	public static void main(String args[])throws Exception
	{ 
	    
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/technorbit", "root", "root");
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter id:");
		int id=sc.nextInt();
		
		System.out.println("enter photo path:");
		String photo=sc.next();
		
		
		String query="insert into image values(?,?)";
		PreparedStatement pstmt=con.prepareStatement(query);
		InputStream is=new FileInputStream(photo);
		
		pstmt.setInt(1,id);
		pstmt.setBinaryStream(2,is);
		int i=pstmt.executeUpdate();
		
		if(i==1)
		{
			System.out.println("Data inserted successfully");
		}
		else
		{
			System.out.println("Data not insert");
        }
    }
}