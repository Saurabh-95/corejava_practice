package india.ExceptonHandling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Throw_thows 
{
	public static void main(String[] args) 
	{
		int i,j,k=0;
		i=8;
		System.out.println("enter no.");
		try
		{
			BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
			j=Integer.parseInt(br.readLine());
			k=i+j;
			if(k<10)
				throw new ArithmeticException("text");
			else
			System.out.println("outpute is :"+k);
		}
		catch (IOException e)
		{
			System.out.println(e);
		}
		catch(ArithmeticException ar)
		{
			System.out.println("value is more then one"+ar);
		}
		
	}

}
