import java.util.Scanner;

 class Input
 {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int a = sc.nextInt();
		System.out.println("enter float value");
		float b = sc.nextFloat();
		System.out.println("enter character" );
		char c = sc.next().charAt(2);
		System.out.println("enter string");
		 //sc.nextLine();
		String d=sc.nextLine();
		
		System.out.println("value " + a);
		System.out.println("value " + b);
		System.out.println("value " + c);
		System.out.println("value " + d);
		
	
	}
	
	
	
 
 
 
 }