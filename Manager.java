class Manager extends Employee1
{
 private int mid;
 String mname;
 
  /*Manager(int mid,String mname)
  {
   this.mid=mid;
   this.mname=mname;
  }*/
  
  Manager()
  {
	  
  }
 
 void setmid(int mid)
  {
	 this.mid=mid; 
  }
  
  void setmname(String mname)
  {
	 this.mname=mname; 
  }
  
  int getmid()
  {
	 return this.mid; 
  }
  
  String getmname()
  {
	 return this.mname; 
  }
  
   static void CalculateSalary()
  {
	System.out.println("salary of manager");  
  }
}