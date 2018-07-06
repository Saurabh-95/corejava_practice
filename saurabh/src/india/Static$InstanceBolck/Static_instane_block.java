package india.Static$InstanceBolck;

public class Static_instane_block 
{
	private int x;
	public Static_instane_block()
	{

		x=5;
		System.out.println("this is Constructor: "+x);
	}
	
	{
		System.out.println("this is instance:"+x);
		
	}
	
public static void main(String[] args) 
{
	Static_instane_block obj =new Static_instane_block();
	
	Static_instane_block obj1 =new Static_instane_block();
}
}
