 abstract class Demo
{
  abstract void gun();
  {
	  
  }	
  abstract void fun();
   Demo()
   {
	   System.out.println("constaructor");
   }   
}
   class Test extends Demo
  {
    void gun()
	{
		System.out.println("gun");
	}
    
	void fun()
	{
	  System.out.println("void gun");
	}
  

   public static void main(String []args)
   {
	 Demo d=new Test();
	 d.gun();
	 d.fun();
	//Demo d=new Demo();
	// d.gun();
   } 
  }   

