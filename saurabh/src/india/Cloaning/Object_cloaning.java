package india.Cloaning;

public class Object_cloaning 
{
	public static void main(String[] args) throws CloneNotSupportedException
	{
		/*
		1-shallow copy
		2-deep
		3-clone		 
		  */
		
		/*shallow obj =new shallow();
		obj.a=5;
		obj.b=6;
		shallow obj1=obj;
		System.out.println(obj1);
		*/
	
	/*Deep obj=new Deep();
	obj.a=8;
	obj.b=10;
	
	Deep obj1=new Deep();
	obj1.a=obj.a;
	obj1.b=obj.b;
	System.out.println(obj1);*/
	
	Clone obj=new Clone();
	obj.a=6;
	obj.b=8;
	
	Clone obj1= (Clone)obj.clone();
	System.out.println(obj1);
	
	}
	

}
class shallow
{
	int a;int b;

	@Override
	public String toString() {
		return "shallow [a=" + a + ", b=" + b + "]";
	}
	
}
class Deep
{
	int a;int b;

	@Override
	public String toString() {
		return "Deep [a=" + a + ", b=" + b + "]";
	}
	
}

class Clone implements Cloneable
{
	int a;
	int b;
	@Override
	public String toString() 
	{
		return "Clone [a=" + a + ", b=" + b + "]";
	}
	
	public Object clone() throws CloneNotSupportedException
	{
		return super.clone();
		
	}
	
}

