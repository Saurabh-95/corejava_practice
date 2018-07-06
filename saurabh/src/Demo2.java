
public class Demo2 
{
//	int a ,b;
//	Demo2(int a, int b)
//	{
//		this.a=a;
//		this.b=b;
//		System.out.println(a+" "+b);
//	}
//	void show()
//	{
//		System.out.println("Ä="+ a+" "+ "B="+b);
//	}
//	public static void main(String[] args) 
//	{
//		 Demo2 obj = new Demo2(2,2);
//		 obj.show();
//	}
//	************************************************
//		void display()
//		{
//		System.out.println("this is display");	
//		}
//		void show()
//		{
//			this.display();
//			System.out.println("this is show method");
//		}
//		public static void main(String[] args)
//		{
//			Demo2 obj = new Demo2();
//			 obj.show();
//		}
//******************************************************
//	Demo2()
//	{
//	
//	System.out.println("this is default");
//	}
//	Demo2(int a)
//	{
//		this();
//	System.out.println("this is parameterised");
//	}
//	public static void main(String[] args) 
//	{
//		Demo2 obj=new Demo2(10);
//	}
//************************************************************

	void show(Demo2 obj)
	{
		System.out.println("this is show method");
	}
	void display()
	{
		show(this);
		System.out.println("this is display");
	}
	public static void main(String[] args) 
	{
		Demo2 obj1=new Demo2();
		obj1.display();
	}
}

