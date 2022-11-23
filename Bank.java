class Deposit extends Thread
{
	private
	  string custname;
	  int amount;
	  
	public
	Deposit(string custname,int amount)
	{
	  this.custname=custname;
	  this.amount=amount;
	}
	
	public void run()
	{
	   
		
	}
	  	
}

class BankCustomer
{
	string name;
	double balance;
	int acoountno;
	
   public BankCustomer(string name,double balance,int acoountno)
	{
		this.name=name;
		this.balance=balance;
		this.accountno=accountno;	
	}
	
	void setName(string name)
	{
		this.name=name;
	}
	
	void setbalance(double balance)
	{
		this.balance=balance;
	}
	
	void setAcoountno(int acoountno)
	{
		this.acoountno=acoountno;
	}
	
	string getName()
	{
		return this.name;
	}
	
	double getBalance()
	{
		return this.balance;
	}
	
	int getAcoountno()
	{
		return this.acoountno;
	}
	
	void currentBalance()
	{
		System.out.println(this.Balance);
	}
	
	void withdraw(double amount)
	{
		this.balance=this.balance-amount;
	}
	
	void deposit(double amount)
	{
		this.balance=this.balance+amount;
	}
	
	
	class Bank
	{
	  public static void main(String []args)
	  {
		 BankCustomer onkar= new BankCustomer(onkar,30000,100); 
		 //BankCustomer ganesh= new BankCustomer(); 
		 //BankCustomer pradip= new BankCustomer(); 
		// BankCustomer affan= new BankCustomer(); 
		
		Deposit dt=new Deposit();
		Withdraw wd=new Withdraw();
		dt.start();
	    wd.start();

	  }	  
		
	}
	
}