package india.Interface;

public class InterfaceDemo1 
{
	public static void main(String[] args)
	{
	demo2 obj=new demo2()
			{
				public void show()
				{
					System.out.println("anonymous  class");
				}
			};
	obj.show();
			
	}
}
interface demo2
{
	void show();
}