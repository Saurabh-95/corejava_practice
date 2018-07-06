package india.ExceptonHandling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class FinallyDemo
{
	public static void main(String[] args) 
	{
		int i,j,k=0;
		i=8;
		System.out.println("enter a number");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		try {
			j=Integer.parseInt(br.readLine());
			k=i/j;
			System.out.println(k);
			} 
		catch (IOException e)
		{
			
			e.printStackTrace();
		}
		finally
		{
			
			System.out.println("bye user");
		}
		
	}
	

}
