package india.Test;

public class IsStringPelindrome
{
	static void checkstring(String s)
	{
		String reverse=new StringBuffer(s).reverse().toString();
		
		if(s.equals(reverse))
		{
			System.out.println("YES Given string is pelindrome");
		}
		else
		{
			System.out.println("NO given no. is not Pelindrom");	
		}
	}
	public static void main(String[] args) 
	{
		checkstring("malayalam");
	}

}
