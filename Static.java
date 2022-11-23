class Static
{

	static //stasic
	{
	 System.out.println("static block executed");
	}
	
	Static() // constructor
	{
		System.out.println("constructor");
	}
	
	void fun() // non statick fun
	{
		System.out.println("non static function");
	}
	
	static 
	//non_static block
	{
		System.out.println("non static block executed");
	}
	
	public static void main(String args[])
	{
      System.out.println("main function");
	  Static st=new Static();//objects
	  st.fun(); //function object
	}


}