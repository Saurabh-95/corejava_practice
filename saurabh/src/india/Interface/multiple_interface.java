package india.Interface;

public class multiple_interface implements two,one

	
{

	@Override
	public void show() 
	{
		System.out.println("hello");
		
	}
	public static void main(String[] args) 
	{
		one a=new multiple_interface();
		two b=new multiple_interface();
		a.show();
		
	}

}
interface one
{
	void show();
}
interface two
{
	void show();
}
