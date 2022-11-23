/*
class Demo1
{
 public static void main(String args[]) throws Exception
 {
  String s="18-08-2001";
  
  java.text.SimpleDateFormat sdf= new java.text.SimpleDateFormat("dd-MM-yyyyy");
  java.util.Date ud=sdf.parse(s);
  System.out.println(ud);

  long ms=ud.getTime();
  System.out.println(ms);
  
  java.sql.Date sd = new java.sql.Date(ms);
  System.out.println(sd);
 }
}
*/



class Demo1
{
	static final String s = "18-08-2001";
	
	public static void main(String args[]) throws Exception
	{
		String s = "18-08-2001";
		
		java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("dd-MM-yyyyy");
		System.out.println(sdf);
		
		java.util.Date ud = sdf.parse(s);
		System.out.println(ud);
		
		long lo = ud.getTime();
		System.out.println(lo);
		
		java.sql.Date sd = new java.sql.Date(lo);
		System.out.println(sd);
		
		// convert sql_date and util date into String
		String stringdate1 = sdf.format(ud);
		System.out.println("String util Date " + stringdate1);
		
		String stringdate2 = sdf.format(sd);
		System.out.println("String sql Date " + stringdate2);
		
		//sql date to util date conversion
		java.util.Date utildate = new java.util.Date();
		utildate = sd;
		System.out.println("String sql date to util Date :"+ utildate);
	}
}
