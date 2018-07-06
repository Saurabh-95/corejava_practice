import java.util.Scanner;

public class Test1string 
{
	static void check_data(int a)
	{
	System.out.println("this is interger type value");
	}
	 static void check_data(String a)
	{
	System.out.println("this is string type value");
	}
	static void check_data(float a)
	{
	System.out.println("this is float type value");
	}
	 static void check_data(double a)
	{
	System.out.println("this is double type value");
	}
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		if (sc.hasNextInt())
			check_data(sc.nextInt());
		
		else if(sc.hasNextFloat())
			check_data(sc.nextFloat());
		else if(sc.hasNextDouble())
			check_data(sc.nextDouble());
		else 
			check_data(sc.next());
		Test1string ob = new Test1string();
		sc.close();
	} 
}
