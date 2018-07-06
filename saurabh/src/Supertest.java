
class abc
{
	int a=20;
	
	void show()
	{
		System.out.println("this is show");
	}
}
class Supertest extends abc
{
	 int a=10;
	 void display()
	 {
		System.out.println(super.a); 
	 }
public static void main(String[] args) 
{
	Supertest obj=new Supertest();
	obj.show();
	obj.display();
}
}
