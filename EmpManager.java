class Emp1Manager
{
 public static void main(String args[])
 {
 //referenc emp object empl
  /*Employee1 emp1= new Employee1();
  emp1.CalculateSalary(); //slary of employee*/
  
  //refe emp object manager
  Employee1 emp2=new Manager(); //upcasting
  emp2.CalculateSalary();  //salary of manager
  
  /* Manager m=new Employee1();//downcasting
   m.CalculateSalary();*/
   
   //static method and non staic method overridden hot nahi
   //stasic method and ststic method over hidding
   //non static and non staic overriden hot
 }
}