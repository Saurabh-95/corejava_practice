package india.string;

public class CompareString 
{
	public static void main(String[] args) 
	{
		String s1=new String("Saurabh");
		String s2=new String("saurabh");
		//boolean b=s1.equals(s2);
		//System.out.println(b);
		//if(s1.equals(s2))
		//if(s1.equalsIgnoreCase(s2))
		//	System.out.println("strings are same");
		//System.out.println("strings are not same");
		int i=(s1.compareTo(s2));
		int j=(s1.compareToIgnoreCase(s2));
		System.out.println(i);
		System.out.println(j);
		
		
	}

}
