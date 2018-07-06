package india.string;

public class Splitdemo 
{
	public static void main(String[] args) 
	{
		String str="saurabh,shukla,satyenda,aditya,gagu";
		String name[]=str.split(",");
	//	System.out.println(name[3]);
		for (String val : name) 
		{
			System.out.println(val);
		}
		
		
	}

}
