package india.ExceptonHandling;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class UserdefineException 
{
	public static void main(String[] args) 
	{
		int i;
		BufferedReader br;
		System.out.println("enter the number");
		try 
		{
			br=new BufferedReader(new InputStreamReader(System.in));
			i=Integer.parseInt(br.readLine());
			if(i<10)
				throw new MyException("value must be greater then 9");	
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
class MyException extends Exception
{

	private static final long serialVersionUID = 1L;

	public MyException(String str)
	{
		super(str);
	}
	
}
