package india.ThisandSuper;

public class Thisdemo3 
{
	public Thisdemo3 nodemo()
	{
		return this;
	}
	void getName()
	{
		this.display();
		System.out.println("this is saurabh");
		
	}
	void display()
	{
		//this.getName();
		System.out.println("yes i am");
	}
	
	public static void main(String[] args) 
	{
		Thisdemo3 obj =new Thisdemo3();
		obj.getName();
		Object i=obj.nodemo();
		System.out.println(i);
		
	}
	

}
