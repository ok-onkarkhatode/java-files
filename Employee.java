class Employee
{
  private int empid;
  private String name;
  private int age;
  
  private String qualification;
  private String companyname;
  protected long basicsalary;
  Oaddress O;
  
   Employee()
   {
	 	 
   }
   
   Employee(int empid,String name,int age,String qualification,String companyname, long basicsalary)
   {
	 O=new Oaddress("nashik","abcd","ahmed");
	 this.empid=empid;
	 this.name=name;
	 this.age=age;
     this.qualification=qualification;	
     this.companyname=companyname;	 	
     this.basicsalary=10000;	  
   }
   
    //setter method
   void setData(  int empid)
  {
    this.empid =  empid;
  }
  
   void setData(String name)
   {
	this.name=  name;
   }
   
   void setData(int age)
   {   
	this.age=  age;
	if(age > 0)
	{
	 System.out.println("age is not valid\n");	
	}
   }
   
   /*void setData(String qualification)
   {
	this.qualification=  qualification;
   }
	
   void setData(String companyname)
   {
	 this.companyname =companyname;  
   }*/
  
  int getEmpid()
  {
	 return this.empid;
  }
  
   String getName()
   {
	 return this.name;  
   }
   
   int getAge()
   {
	 return this.age;  
   }
   
   int getQualification()
   {
	  return this.qualification 
   }
   
   long getBasicsalary
   {
	  return this.basicsalary; 
	   
   }
   
   String getCompanyname()
   {
	 return this.companyname;  
   }
    
	
 } 