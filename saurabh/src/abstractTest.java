 interface test
{
	 int a= 10;
	void show();
	
}
 interface test1
 {
	void display1();
 }

public class abstractTest  implements test, test1
{
	public void show()
	{

		System.out.println("this interface method");
		System.out.println(a);
	}
	public void display1()
	{
		System.out.println(" this is another inerface");
	}
	
	public static void main(String[] args) 
	{
		abstractTest obj= new abstractTest();
		obj.show();
		obj.display1();
		
	}

	
}
 
