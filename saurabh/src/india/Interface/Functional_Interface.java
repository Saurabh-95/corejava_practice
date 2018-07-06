package india.Interface;

public class Functional_Interface
{
	public static void main(String[] args) 
	{
	demo3 obj=()->System.out.println("inteface method show()");
	obj.show();
	demo4.show();
	}
}
interface demo3
{
	void show();
}
interface demo4
{
	static void show()
	{
		System.out.println("hello");
	}
	
	
}