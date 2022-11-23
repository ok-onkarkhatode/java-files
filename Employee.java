//anonaymous function
class Employee
{
 
 void calcsalary()
 {
  System.out.println("sal");
 }
 public static void main(String args[])
 {
  Employee onkar=new Employee()
  {
    void calcsalary()
	{
	 System.out.println("salary");
	}
  };
	onkar.calcsalary();
  }
 }

