package india.Test;

public class NumberPalindrome 
{
	static void IsPalindrome(int num)
	{
		int temp=0;
		int temp2=num;
		if((num>=0)&&(num<10))
		{
			System.out.println("number is already Palindrome="+num);
		}
		else
		{
			while(num>0)
			{
			int n=num%10;
			num=num/10;
			temp=(temp*10)+n;
			}
		}
		 if(temp==temp2)
			 System.out.println("no is pelindrome="+temp2);
		 else
		System.out.println("no is not pelindrome="+temp2 );
	}
	
	public static void main(String[] args) 
	{
		IsPalindrome(122);
	}
}
