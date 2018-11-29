package india;

import java.util.Scanner;

public class Stack_demo 
{   
	static int A[] =new int[5];
	static int top=-1;
	static int max=A.length-1;
	static void push(int item)
	{
		if(top==max)
		{
			System.out.println("satck is over flow \n");
		}
		else 
		{	
			top=top+1;
			A[top]=item;
			System.out.println("one element is is push\n");
			for(int i=0;i<=top;i++)
				System.out.print(A[i]+" ");
		}
		
	}
	
	static void pop()
	{
		if(top==-1)
		{
			System.out.println("stack is underflow\n");	
		}
		else
		{
			top=top-1;
			System.out.println("one element is pop\n");
			for(int i=0;i<=top;i++)
				System.out.print(A[i]+" ");
		}
	
	}
	public static void main(String[] args) 
	{
		int num;
		Scanner sc=new Scanner(System.in);
		 do 
		 {
			 System.out.println();
				System.out.println("enter 1 to push the element");
				System.out.println("enter 2 to pop the element");
				System.out.println("enter 3 to Exit");
				 num=sc.nextInt();
			 if(num==1)
			 {
				 System.out.println("enter the value which u want");
				 int item=sc.nextInt();
				 Stack_demo.push(item);
			 }
			 if(num==2)
			 {
				 Stack_demo.pop();
				 
			 }
			 
		 }while(num!=3);
		

	}
}
