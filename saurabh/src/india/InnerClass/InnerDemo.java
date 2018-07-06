package india.InnerClass;

public class InnerDemo 
{
	public static void main(String[] args) 
	{
		//Outer obj=new Outer();
		//obj.show();
		Outer.Inner obj1=new Outer().new Inner();
		obj1.show();
		
	}

}
class Outer
{
	int a=10;
    void show() 
    {
	System.out.println("this is Outer a: "+a);	
    }
    
    class Inner
    {
    	int b=100;
    	 void show()
    	{
    	System.out.println("this is Inner b: "+b);
    	System.out.println("this is Outer a: "+a);
    	}
    }
	
}
