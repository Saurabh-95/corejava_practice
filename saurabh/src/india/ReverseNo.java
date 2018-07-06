package india;

import java.util.Scanner;

public class ReverseNo
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("enter no that u want reverse: ");
		int num=sc.nextInt();
		System.out.println("yr no is: "+num);
		///for(int i=num;i>0;i=num/10)
		System.out.print("no after reverse: ");
		while(num>0)
		{
			int reverse = num%10;
			num=num/10;
			System.out.print(reverse);
		}
		sc.close();
	}
	

}
