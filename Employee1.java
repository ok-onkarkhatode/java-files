class Employee1
{
  int empid;
  String ename;
  String mno;
  
  /*Employee1(int empid,String ename,String mno)
  {
	this.empid=empid;
    this.ename=ename;
    this.mno=mno; 	  
  }*/
  Employee1()
  {
	  
  }
  
  void setempid(int empid)
  {
	 this.empid=empid; 
  }
  
  void setename(String ename)
  {
	 this.ename=ename; 
  }
  
  void setmno(String mno)
  {
	 this.mno=mno; 
  }
  
  int getempid()
  {
	 return this.empid; 
  }
  
  String getename()
  {
	 return this.ename; 
  }
  
  String getmno()
  {
	 return this.mno; 
  }
  
   static void CalculateSalary()
  {
	System.out.println("salary of employee");  
  }
}