package india.ThisandSuper;

public class StaicDemo 
{
public static void main(String[] args) 
{
	Emp saurabh=new Emp();
	
	saurabh.show();
	Emp satyendra=new Emp();

	satyendra.show();
}
}
class Emp
{
	int id;
	int salary;
	static String ceo;
	void show()
		{
		System.out.println(id+":"+salary+":"+ceo);	
		}
	static
	{
		ceo="amit";
		System.out.println(" static block");
	}
	Emp()
	{
		id=001;
		salary=10000;
		
		System.out.println(" this is hello");
	}
	
	

}
