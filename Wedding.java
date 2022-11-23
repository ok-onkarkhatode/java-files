class LowAgeException extends Exception
{
	LowAgeException()
	{
		super();
	}
	
	LowAgeException(String msg)
	{
		super(msg);
	}
	
}

class HighAgeException extends Exception
{
	HighAgeException()
    {
		super();
	}
	
	HighAgeException(String msg)
	{
		super(msg);
	}
}

class Wedding
{
	int Age;
	
	
	public void fun(int Age)throws LowAgeException
	{
		if(Age < 21)
		{
			throw new LowAgeException("no age of wedding");
		}
		
		else
		{
			System.out.println("age of wedding");
		}
	}
	
	public void gun(int Age)throws HighAgeException
	{
		if(Age > 60)
		{
			throw new HighAgeException("no age of wedding 60+");
		}
		
		else
		{
			System.out.println("age of wedding");
		}
	}
}

class Matrimony
{
	public static void main(String args[])
	{
		Wedding l=new Wedding();
		
		try
	     {
			 l.fun(22);
		 }
		     
		 catch(LowAgeException la)
	     { 
			 la.printStackTrace();
		 }
		
		
		
	     try
	     {
			 l.gun(30);
		 }
		     
		 catch(HighAgeException ha)
	     { 
		    
			 ha.printStackTrace();
		 }
	}
}