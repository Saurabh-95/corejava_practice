package india.ThisandSuper;
//The this is used to call overloaded constructor in java

public class Thisdemo2 
{
	private  String name;
	Thisdemo2()
	{
	this("saurabh");
	}
	Thisdemo2(String n)
	{
		this.name=n;
		//System.out.println(this.name);
	}
	
	public static void main(String[] args) 
	{
	Thisdemo2 obj=new Thisdemo2("abc");
		
		System.out.println(obj.name);
		
		
		
	}

}
