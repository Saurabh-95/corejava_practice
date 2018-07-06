
public class Demo1 
{
	void show(Demo1 obj)//object of class
	{
		System.out.println("hello");
		
	}
	void display()
	{
		show(this);
		System.out.println("hey");	
	}
	public static void main(String[] args)
	{
		Demo1 a=new Demo1();
		a.display();
		
		
	}

}
