
public class This 
{
	int a=10;
	This(int a)
	{
		this.a=a;
		System.out.println(a);
	}
	void show ()
	{
		System.out.println(a);
	}
	public static void main(String[] args) 
	{
		 This obj=new This(5);
		 obj.show();
		
	}
	
}
	
	
