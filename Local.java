class Local
{
 
 void fun()
 {
	int a=20;
 class Test
 {
  void gun()
  {
	 // a++;
   System.out.println(a);
  }
 } 
  //a++;
  Test t=new Test();
  t.gun();
  System.out.println(a);
 }
  public static void main(String args[])
  {
   Local t=new Local();
   t.fun();
  }
}