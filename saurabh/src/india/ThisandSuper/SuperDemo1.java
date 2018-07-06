package india.ThisandSuper;

public class SuperDemo1 
{
public static void main(String[] args) 
{
	Sattu obj= new Sattu();
	obj.show();
	obj.display();
}
}
class saurabh
{
	int a=5;
	void display()
	{
		System.out.println("saurabh display ");
	}
	
}
class Sattu extends saurabh
{
	int a=4;
	
	void show()
	{
		System.out.println(super.a);
	}
	
	void display()
	{
		super.display();
		System.out.println("sattu displayx");
	}
}

