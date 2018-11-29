package india.ExceptonHandling.test;

import java.io.IOException;

public class test1 extends building
{
	void color()throws IOException
	{
		System.out.println("blue");
	}
	public static void main(String[] args)
	{
		building obj=new test1();
		try
		{
			obj.color();
		} catch (Exception e)
		{
			System.out.println(e);
		}	
	}
	
}
class building
{
	void color() throws IOException
	{
		System.out.println("blue");
	}
	
}

