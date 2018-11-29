package india.Test;

import java.util.Scanner;

public class ReverseStrWithoutSpecialChar 
{
	static void getReverseStrWithoutSpecialChar(String str)
	{
		char[]charArray=str.toCharArray();
		int right=charArray.length-1,left=0;
		while(left<right)
		{
			if(!Character.isAlphabetic(charArray[left]))
				left++;
			else if(!Character.isAlphabetic(charArray[right]))
				right--;
			else
			{
				char temp=charArray[left];
				charArray[left]=charArray[right];
				charArray[right]=temp;
				left++;
				right--;
			}
		}
		System.out.print("string after revese->");
		for(int i=0;i<=charArray.length-1;i++)
		{
			System.out.print(charArray[i]);
		}
		
	}
		public static void main(String[] args) 
		{
			Scanner sc=new Scanner(System.in);
			System.out.println(" enter the string with spacial character=");
		 String s=sc.nextLine();
		 getReverseStrWithoutSpecialChar(s);

		}
}
