
class Person
{
  String name;
  int mobileno;
  String address;

}


class Student10 extends Person
{
 int rollno;
 String name;




 public static void main(String args[])
 {
  Student10 s= new Student10();
  System.out.println("rollno="+s.rollno);
  System.out.println("string="+s.name);
 }
}