package india.string;

public class StringBufferDemo 
{
	public static void main(String[] args) 
	{
		StringBuffer sbf=new StringBuffer("saurabh");
		sbf.append(" shukla");
		System.out.println(sbf);
		sbf.delete(2, 4);
		System.out.println(sbf);
		sbf.insert(2,5);
		System.out.println(sbf);
		sbf.reverse();
		System.out.println(sbf);
		sbf.replace(1, 3, "pppppp");
		System.out.println(sbf);
		
		System.out.println(sbf.length());
		
	}

}
