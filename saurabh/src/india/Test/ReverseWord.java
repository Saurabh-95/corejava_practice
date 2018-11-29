package india.Test;

public class ReverseWord 
{
static void getword(String s)
{
	String []str=s.split(" ");
	int l=str.length-1;
	for(int i=0;i<=l;i++)
	{
		char[]ch=str[i].toCharArray();
		int len=ch.length-1;
		char[]c=new char[50];
		int n=0;
		for(int j=len;j>=0;j--)
		{
			char a=ch[j];
			c[n]=a;
			n++;
		}
		c[n++]=' ';
		for(int k=0;k<n;k++)
			System.out.print(c[k]);
	}
	
	
}
	public static void main(String[] args)
	{
	 String a="saurabh shukla is bad";
	 getword(a);
	 
	}
}
