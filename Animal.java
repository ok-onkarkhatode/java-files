interface Animal
{
  void eating();
  void sleeping();
  void drink();
} 
  class Dog implements Animal
  {
    public void eating()
	{
	  System.out.println("eating food");
	}
	
	public void sleeping()
	{
	 System.out.println("dog sleping");
	}
	
	public static void main(String args[])
	{
	// Animal An=new Dog();
	// An.eating();
	 
	 Animal An=new Animal();
	 An.sleeping();
	}
  }

