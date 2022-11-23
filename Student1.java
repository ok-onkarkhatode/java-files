class Student
{
  int rollno;
  String name;
  float per;
 

   Student(int rollno,String name,float per)
     {
        this.rollno=rollno;
        this.name=name;
        this.per=per;       
     }
	 
}

class Test
{
   public static void main(String args[])
      {

       Student s1=new Student(40,"onkar",75);
      // Student s2=new Student(40,"onkar",75);    

       System.out.println(s1.hashCode());


     }
}