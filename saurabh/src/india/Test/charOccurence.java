package india.Test;

import java.util.Scanner;

public class charOccurence 
{
	static final int MAX=256;
	
	static void getOccuringChar(String str)
	{
		int count[]=new int[MAX];
		int len=str.length();
		
		for(int i=0;i<len;i++)
		{
			char c=str.charAt(i);	
			count[c]++;
		}
		

		char[]ch=new char[len];
		
		for(int i=0;i<len;i++)
		{
			ch[i]=str.charAt(i);
			int find=0;
			for(int j=0;j<=i;j++)
			{
				if(ch[i]==ch[j])
					find++;
			}
			
			if(find==1)
				System.out.println("number of occurence of "+ch[i]+" is "+count[ch[i]]);
			
		}
	}
	static public void show()
	{
		
	}
	public   static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string to find the occurence of char= ");
		String s=sc.nextLine();
		getOccuringChar(s);
		
	}

}
