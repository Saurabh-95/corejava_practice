package india.Interface;

public class InterfaceDemo 
{
	public static void main(String[] args)
	{
		ABC obj=new ABC(); 
			
			
		obj.show();
	
	}
}
interface Demo1 
{
	int a=5;
	void show();
}

 
class ABC implements Demo1
{
public void show()
	{
			System.out.println("this is interface method");
			System.out.println("this is interface variable:"+(a));
	}

}