import java.lang.Integer;

class Demo
{
  public static void main(String args[])
  {
	  //primitive to wrapper
    Integer i=new Integer(10);
	//System.out.println(i);
	//System.out.println(i.valueOf(10));
	//System.out.println(i.hashCode());
	
	//wrapper to primitive
	//System.out.println(i.intValue());
	//System.out.println(i.floatValue());
	
	//primitive to string 
	//String y=Integer.toString(10);
	//System.out.println(y);
	
	//string to primitive
	//int a=Integer.parseInt("10");
	//System.out.println(a);
	
	//string to wrapper object
	Integer i=new Integer(10);
	System.out.println(Integer.valueOf("20"));
	System.out.println(i);
	
	//wrapper to string
	Integer i=new Integer(100);
  }

}