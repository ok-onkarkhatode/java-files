class Manager extends Employee1
{
 private int bonus;
 
   Manager(int empid,String name,int age,String qualification, String companyname,int bonus)
   {
	 super(11,"ganesh",20,"TYBCA","TCS");
	 this.bonus = bonus;  
   }
 
 public static void main(String args[])
 {
  Manager ganesh=new Manager(11,"ganesh",20,"TYBCA","TCS",10000);
  ganesh.info();
  ganesh.calsal();
 }
 void info()
 {
	 //setAge(23);
	 System.out.println("name of manager"+getName());
	 System.out.println("age of manager"+getAge());
	 System.out.println("address of manager"+getAddress());
	 System.out.println("salary of manager"+getBasicsalary());
	 System.out.println("qualification of manager"+getQualification());
	 System.out.println("city"+O.getCity());
	 
 }
 void calsal
 {
	 long sal;
	 long bonu=this.bonus;
	 long basics=getBasicsalary();
	 sal =bonu + basics;
	 System.out.println("salary of the manager"+sal);
 }
}