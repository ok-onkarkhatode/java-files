class InvalidAmountException extends Exception 
{
	InvalidAmountException()
	{
		super();
	}
	
	InvalidAmountException(String msg)
	{
		super(msg);
	}
}

class InsufficientAmountException extends Exception
{
	InsufficientAmountException()
	{
		super();
	}
	
	InsufficientAmountException(String msg)
	{
		super(msg);
	}
}

class HDFC 
{
	int balance;
	int amount;
	
	HDFC()
	{
		this.balance=10000;
	}
	
	public void deposit(int amount) throws InvalidAmountException
	{
		if(amount<0)
		{
			throw new InvalidAmountException("amount is not valid");
		}
		
		else
		{
			System.out.println("you can deposit amount easily");
		}
	}
	
    public void withdraw(int amount) throws InvalidAmountException,InsufficientAmountException
	{
		if(amount<0)
		{
			
			throw new  InvalidAmountException("amount is not valid");
		}
		
		else if(amount > balance)
		{
			throw new InsufficientAmountException("amount is greater  than balance");
		}
		
		else
		{
			System.out.println("you can withdraw amount easily");
		}
	}
}
	
		
class Transaction
{
	public static void main(String args[])
	{
		int choice;
		HDFC hf=new HDFC();
		
	     try
	     {
			 hf.deposit(5000);
		 }
		     
		 catch(InvalidAmountException am)
	     { 
			 am.printStackTrace();
		 }
		
		
		
	     try
	     {
			 hf.withdraw(20000);
		 }
		     
		 catch(InsufficientAmountException ins)
	     { 
		    
			 ins.printStackTrace();
		 }
		 
		 catch(InvalidAmountException am)
	     { 
		    
			 am.printStackTrace();
		 }
		
		
	}
}

/*
import java.util.Scanner;
class InvalidAmountException extends RuntimeException 
{
	InvalidAmountException()
	{
		super();
	}
	
	InvalidAmountException(String msg)
	{
		super(msg);
	}
}

class InsufficientAmountException extends RuntimeException
{
	InsufficientAmountException()
	{
		super();
	}
	
	InsufficientAmountException(String msg)
	{
		super(msg);
	}
}

interface Bank
{
	void deposit(int amount) throws InvalidAmountException;
	//void withdraw(int amount) throws InvalidAmountException,InsufficientAmountException;
}
class HDFC implements Bank
{
	int balance;
	
	HDFC()
	{
		this.balance=10000;
	}
	
	public void deposit(int amount) throws InvalidAmountException
	{
		if(amount<0)
		{
			throw new InvalidAmountException("amount is not valid");
		}
		else
		{
			System.out.println("you can deposit amount easily");
		}
	}
	
	public void withdraw(int amount) throws InvalidAmountException,InsufficientAmountException
	{
		if(amount<0)
		{
			throw new InvalidAmountException("amount is not valid");
		}
		
		else if(amount > balance)
		{
			throw new InsufficientAmountException("Insufficient Balnace");
		}
		
		else
		{
			System.out.println("you can withdraw amount easily");
		}
	}
}
	
		
class Transaction
{
	public static void main(String args[])
	{
		int choice;
		HDFC hf=new HDFC();
		System.out.println("1.deposit");
		System.out.println("2.withdraw");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your choice");
		choice=sc.nextInt();
		switch(choice)
		{
			case 1:
				try{
					hf.deposit(-2);	
				}
				catch(InvalidAmountException iae){
					iae.printStackTrace();
				}
				break;
			case 2:
				try
				{
					hf.withdraw(11000);	
				}
				catch(InvalidAmountException iae)
				{
					iae.printStackTrace();
				}
				catch(InsufficientAmountException ie)
				{
					ie.printStackTrace();
				}
		}				
	}
}
		
	*/