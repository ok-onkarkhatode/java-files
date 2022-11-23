class EachString
{
	public static void main(String args[])
	{
		int a= Integer.parseInt(args[0]);
		int b= Double.parseDouble(args[1]);
		int c= Float.parseFloat(args[2]);
		
		String d = args[3];
		System.out.println("int\tdouble\tfloat\tstring");
		System.out.println(a+"\t"+b+"\t"+c+"\t"+d);
	
	}
}