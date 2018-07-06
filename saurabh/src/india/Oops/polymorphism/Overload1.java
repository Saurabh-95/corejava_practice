package india.Oops.polymorphism;
//by changing data type of argument
 class A 
{
	void area(int a,int b)
	{
		System.out.println("Area is: "+a*b);
	}

}
class B extends A
{
	void area (int a,int b,int c)
	{
		System.out.println("Area is: "+a*b*c);
	}
}
public class Overload1 
{
	public static void main(String[] args) 
	{
		B obj=new B();
		obj.area(5, 6);
		obj.area(5, 6, 2);
	}

}