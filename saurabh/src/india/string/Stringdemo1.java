package india.string;

public class Stringdemo1
{
	public static void main(String[] args) 
	{
		String s1="saurabh";
		String s2="saurabh";
		String s3=new String("saurabh");
		System.out.println("result 1: "+(s1==s2));//compare references 
		System.out.println("result 2: "+(s1.equals(s2)));//compare string
		System.out.println("result 3: "+(s1==s3));
		System.out.println("result 4: "+(s1.equals(s3)));
	}

}
