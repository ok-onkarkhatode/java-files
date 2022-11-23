class Demo extends Thread
{
   int i;
   
   public void run()
   {
	   int i=0;
	   int sum=45;
      for(int i=10;i>0;i--)
	  {
		  sum=sum+i;
		  
		  system.out.println(sum);
		  
	  }
   }


   public static void main(String []args)
   {
	   Demo d=new Demo()
	   d.start();
	   
	   int i;
	   int sum=0;
	   
	    for(i=10;i<12;i++)
		{
			
			
		}
   
   }

}