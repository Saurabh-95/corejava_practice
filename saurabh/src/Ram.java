// use of final key 
 public class Ram 
{
	 final int a= 10;
	 void show()
	{
	//	a=5;
		System.out.println(a);
	}
	public static void main(String[] args) 
	{
		Ram obj=new Ram();
		obj.show();
	}
}
  class a extends Ram
{
	 final void show()
	{
		
	}
}
