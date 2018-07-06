package india.string;

public class IndexOfDemo 
{
	public static void main(String[] args) 
	{
		String s="saurabh";
		int a=s.indexOf('a',1);
		int b=s.lastIndexOf('a');
		System.out.println(a);
		System.out.println(b);
		
		String s1="saurabh is good boy";
		int c=s1.indexOf("oo" ,9);
		System.out.println(c);
	}

}
