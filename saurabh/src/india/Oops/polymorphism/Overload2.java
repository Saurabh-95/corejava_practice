package india.Oops.polymorphism;
//changing type of arguments

public class Overload2 
{
	public static void main(String[] args) 
	{
		BB obj=new BB();
		obj.area(5, 6);
		obj.area(5.5f, 5);
		
	}

}
class AB
{
	void area(int a,int b)
	{
		System.out.println("Area is: "+a*b);
	}

}
class BB extends AB
{
	void area (float a,float b)
	{
		System.out.println("Area is: "+a*b);
	}
}
