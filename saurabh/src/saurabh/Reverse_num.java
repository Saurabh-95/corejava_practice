package saurabh;

public class Reverse_num
{
	void revers(int n)
	{
		int temp;
		while(n>0)
		{
		temp=n%10;
		n=n/10;
		System.out.print(temp+" ");
		}	
	}
	public static void main(String[] args)
	{
		Reverse_num obj=new Reverse_num();
		obj.revers(5423);
	}

}
