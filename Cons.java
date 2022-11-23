import java.io.Console;

class Cons
{
	public static void main(String args[])
	{
		Console cls = System.console();
		System.out.println("Enter the password");
		char ch[] = cls.readPassword();
		System.out.println(ch);
	
	}



}