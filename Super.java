class Parent
{
  Parent(int a)
  {
	  System.out.println("parent constrator"+a);
  }

}

class Child extends Parent
{
  Child(int a,int b)
  {
	 super(a);
	System.out.println("child constrauctor"+b);  
  }
 public static void main(String args[])
 {
   Child om=new Child(10,20);
 
 }
}