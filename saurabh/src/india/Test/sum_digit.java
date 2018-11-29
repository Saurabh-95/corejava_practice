package india.Test;

import java.util.Scanner;

public class sum_digit
{
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the the  value");
		int i=sc.nextInt();
		//System.out.println(i);
		int num=i;
		int sum=0;
		int temp;
		while(i>0)
		{
			temp=i%10;
			sum=sum+temp;
			i=i/10;	
		}
		System.out.println("the digite "+num+" sum is= "+sum);
	}

}
