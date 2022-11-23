class Outer
{
//Normal inner class
 class Inner
 {
 
  void fun()
  {
   System.out.println("out");
  }
 }
 void gun()
 {
  Inner i=new Inner();
  i.fun();
 }
 
 public static void main(String args[])
 {
	//Outer o=new Outer();
    //o.gun();	
	 
 // Outer o=new Outer();
  //Outer.Inner i=o.new Inner();
  //i.fun();
  
  // Outer.Inner i=new Outer().new Inner();
  // i.fun();
  
   //new Outer().new Inner().fun();
  
 }
 
}