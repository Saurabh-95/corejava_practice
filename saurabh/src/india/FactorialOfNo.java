package india;

import java.util.Scanner;

public class FactorialOfNo 
{
	void fact(int num)
	{
		int f=1;
		for(int i=num;i>1;i--)
		{
			 f=f*i;
		}
		System.out.println("factorial of "+num+": "+f);
	}
	public static void main(String[] args) 
	{
		Scanner cs =new Scanner(System.in);
		System.out.print("enter no that u want factorial: ");
		int num =cs.nextInt();
		FactorialOfNo obj=new FactorialOfNo();
		obj.fact(num);
		
	}

}
