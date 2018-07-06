public class Override 
{
	void show ()
	{
		int i=2;
		System.out.println("main");
		System.out.println(i);
	}
}
class Drive extends Override 
{
	void show()
	{
		System.out.println("derive");
	}
	public static void main(String[] args)
	{
		Override obj1=new Override();
		obj1.show();
		Drive obj2= new Drive();
		obj2.show();
		Override obj=new Drive(); /*this override*/
		obj.show();
		//Drive obj3= new Override(); not possible in java
		
	
	}
}


