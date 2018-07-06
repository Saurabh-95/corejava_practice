package india.Oops.polymorphism;


class ABCD
{
	void show()
	{
		System.out.println("this super class");
	}
	
}
class BCD  extends ABCD
{
	void show()
	{
		System.out.println("this sub class");
	}
}
public class override1 
{
 public static void main(String[] args) 
 {
	 BCD obj1=new BCD();
	 ABCD obj=new ABCD();
	// ABCD obj2=new BCD();// ovrrride
	 obj.show();
	 obj1.show();
 }
}