 class Customer
 {
    private String custname;
	private String custvillagename;
	private long custpincode;
	private int custareacode;
	
	Customer(String custname,String custvillagename,long custpincode,int custareacode)
	{
		this.custname=custname;
		this.custvillagename=custvillagename;
		this.custpincode=custpincode;
		this.custareacode=custareacode;	
	}
	   //setter method
	void setCustName(String custname)
	{
		this.custname=custname;
	}
	
	void setCustVillageName(String custvillagename)
	{
		this.custvillagename=custvillagename;
	}
	
	void setCustPincode(long custpincode)
	{
	  this.custpincode=custpincode;	
	}
	
	void setCustAreaCode(int custareacode)
	{
		this.custareacode=custareacode;
	}
	
	   //getter method
	   void getCustName()
	{
		return this.custname;
	}
	
	void getCustVillageName()
	{
		return this.custvillagename;
	}
	
	void getCustPincode()
	{
	  return this.custpincode;	
	}
	
	void getCustAreaCode()
	{
		return this.custareacode;
	}
	 /*  
    public static void main(String args[])
	{
		Customer c=new Customer("ok","rajapur",2605,4242);
		
	}
     */	
 }