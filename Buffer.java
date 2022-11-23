// Buffer reader

import java.io.BufferedReader;
import java.io.InputStreamReader;

class Buffer
{
	public static void main(String args[]) throws Exception
	{
		InputStreamReader is=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(is);
		
		int a=Integer.parseInt(br.readLine());
		System.out.println(a);
		
		float b=Float.parseFloat(br.readLine());
		System.out.println(b);
	}

}