package india.string.Reverse_string;

public class Reverse2 
{
	public static void main(String[] args) 
	{
		String s="saurabh";
		char[]sarr=s.toCharArray();
		for(int i=sarr.length-1;i>=0;i--)
		{
			System.out.print(sarr[i]);
		}
	}

}
