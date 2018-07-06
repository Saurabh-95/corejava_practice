package india.ExceptonHandling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Multple_catch 
{
	public static void main(String[] args) 
	{
		int i,j,k=0;
		int a[]=new int [4];
		i=8;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		try
		{
			j=Integer.parseInt(br.readLine());
			k=i/j;
//			for(int c=0;c<4;c++)
//				a[c]=c+1;
//			for (int value : a)
//			{
//				System.out.println(value);
//			}
			
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
		catch(ArithmeticException e)
		{
			System.out.println("not divided by zero"+e);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("not more then 4 values");
		}
		System.out.println(k);
	}

}
