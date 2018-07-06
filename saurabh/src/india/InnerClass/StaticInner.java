package india.InnerClass;

public class StaticInner 
{
	public static void main(String[] args) 
	{
		Outer1.show();
		Outer1.Inner1.display();
		// OR //Outer1.Inner1 obj=new Outer1.Inner1();
	//	obj.display();
	}

}
 class Outer1
{
	static int a=10;
	static void show()
	{
			System.out.println(a);
	}
	static class Inner1
	{
	static int b=100;
	static void display()
	{
		System.out.println(b);
	}
	}
	
}

