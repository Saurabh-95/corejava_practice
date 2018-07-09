package india.MultiThreading;


class Hi
{
	void show() 
	{
		for(int i=0;i<=4;i++) 
		{
			System.out.println("hi saurabh");
		try {Thread.sleep(1000);}catch(Exception e) {}
		}
	}
}
class Hello
{
	void show()  
	{
		for(int i=0;i<=4;i++)
		{
			System.out.println("hello saurabh");
		try {Thread.sleep(1000);}catch(Exception e) {}
		}
	}
}
public class Thread_Demo 
{
	public static void main(String[] args)
	{
	 Hi obj=new Hi();
	 Hello obj1=new Hello();
	 obj.show();
	 obj1.show();
	}
}
