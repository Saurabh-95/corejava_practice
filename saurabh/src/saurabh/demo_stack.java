package saurabh;

import java.util.Scanner;

public class demo_stack 
{
	static int[]a=new int[5];
	static int top=-1;
	static int max=a.length-1;
	
	static void push(int item)
	{
		if(top==max)
		{
			System.out.println("stack is over flow");
		}
		else
		{
			top=top+1;
			a[top]=item;
			System.out.println("one element is pushed");
			for(int i=0;i<=top;i++)
			{
				System.out.print(a[i]+" ");
			}
		}
	}
	
	static void pop()
	{
		if(top==-1)
		{
			System.out.println("satck is under flow");
		}
		else
		{
			top=top-1;
			System.out.println(" one element is poped");
			for(int i=0;i<=top;i++)
			{
				System.out.print(a[i]+" ");
			}
		}
	}
	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int num;
		do {
		System.out.println("1 for push");
		System.out.println("2 for pop");
		System.out.println("3 for exit");
		num=sc.nextInt();
		if(num==1)
		{
			System.out.println("enter the pushing:");
			int item=sc.nextInt();
			push(item);
			System.out.println();
		}
		if(num==2)
		{
			pop();
			System.out.println();
		}
		}while(num!=3);
		sc.close();
	}

}
