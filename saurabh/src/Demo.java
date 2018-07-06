
public class Demo 
{
//	int show()
//	{
//		System.out.println("hello");
//		return(1);
//	}
//	float show(int i)
//	{
//		System.out.println("this is integer");
//		return(i);
//	}
//	public static void main(String[] args)
//	{
//		Demo obj = new Demo();
//		obj.show();
//		obj.show(1);
//	
//	
//	}
	void show()
	{
		System.out.println("this id child method");
	}
	int show(int i)
	{
		System.out.println("this id child method1");
		return 0;
	}
	void show( int i,int j)
	{
		System.out.println("this id child method2");
	}
	public static void main(String[] args) 
	{
		Demo obj =new Demo();//override
		
		obj.show(2);
	}
}

//  class abc
//{
//	void show()
//	{
//		System.out.println("this parent method");
//	}
//}


