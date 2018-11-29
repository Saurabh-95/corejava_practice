package india;

import java.util.Scanner;

public class PatternDiamond 
{
	
	static void diamondshape(int n)
	{
		int space=n-1;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<space;j++)
				System.out.print(" ");
			
			for (int j = 0; j <=i; j++)
				System.out.print("* ");
			
			System.out.println();
			space--;
			
		}
		space=0;
		for(int i=n;i>0;i--)
		{
			for(int j=0;j<space;j++)
				System.out.print(" ");
			
			for (int j = 0; j <i; j++)
				System.out.print("* ");
			
			System.out.println();
			space++;
			
		}
	}
	public static void main(String[] args) 
	{
		/*Scanner sc=new Scanner(System.in);
		System.out.println("enter the no for diamondshape");
		int i=sc.nextInt();*/
		
		diamondshape(5);
	}
}
