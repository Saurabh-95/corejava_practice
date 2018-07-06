package india;

public class ConsturctorDemo 
{
	 int i;
	 float f;
	
	
	ConsturctorDemo()
	{
		i=5;
		f=2.5f;
		System.out.println(i);
		System.out.println(f);
	}
	ConsturctorDemo(int x)
	{
		i=55;
		f=22.5f;
		System.out.println(i);
		System.out.println(f);
	}
	public static void main(String[] args) 
	{
		new ConsturctorDemo(5);
		
	}
}
