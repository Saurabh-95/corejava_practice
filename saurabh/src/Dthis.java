//
//public class Dthis 
//{
//	void show()
//	{
//		display();
//		System.out.println("hello");
//	}
//	void display()
//	{
//		System.out.println("hey");	
//	}
//	void show1()
//	{
//		System.out.println("hii");
//	}
//	public static void main(String[] args) 
//	{
//		Dthis obj=new Dthis();
//		obj.show();
//		
//		
//	}
//}
 public class Dthis{

Dthis()
{
	this(10);
	System.out.println("default");
}
Dthis(int a)
{
	System.out.println("parameterized");
}
void show()
{

System.out.println("hello");
}
public static void main(String[] args) 
{
	Dthis a = new Dthis();
	a.show();
}

}