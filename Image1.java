import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.io.InputStream;
import java.io.FileInputStream;
import java.io.OutputStream;
import java.io.FileOutputStream;
import java.sql.ResultSet;


class Image1
{
	public static void main(String args[])throws Exception
	{ 
	    String query="select * from image where id=?";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/technorbit", "root", "root");
		 
		PreparedStatement pst=con.prepareStatement(query);
		Scanner sc=new Scanner(System.in);
		System.out.println("enter id");
		int id=sc.nextInt();
		pst.setInt(1,id);
		ResultSet rs=pst.executeQuery();
		rs.next();
		 
		InputStream is=rs.getBinaryStream(2);
		OutputStream os=new FileOutputStream("D://programs/jdbc/Image.jpeg");
		System.out.println("photo successfuly view at folder");
		org.apache.commons.io.IOUtils.copy(is,os);
		//System.out.println("photo successfuly view at folder");
		
    }
}