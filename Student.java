class Student
{
  private int age;


void setAge(int age)//setter method
{
	if(age > 0)
	{
      this.age=age;  
	}
	else
	{
		System.out.println("age is not valid");
		
	}
}

int getAge() //getter method
{
  return this.age; // return to this
}
}
class Clerk
{
  public static void main(String args[])
  {
	 int a;
   Student s=new Student();
   s.setAge(-19);
    a=s.getAge(); 
	System.out.println(a);
  }
 }
