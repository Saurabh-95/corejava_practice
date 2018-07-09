package india.MultiThreading;

class demo implements Runnable
{
	public void run()
	{
		for(int i=0;i<=4;i++)
		{
			System.out.println("hi");
		try {Thread.sleep(1000);}catch(Exception e) {}
		}
	}
}
class demo1 implements Runnable
{
	public void run()
	{
		for(int i=0;i<=4;i++)
		{
			System.out.println("hello");
		try {Thread.sleep(1000);}catch(Exception e) {}
		}
	}
}

public class Runnable_Interface 
{
	public static void main(String[] args) 
	{
		
//or		demo obj=new demo();
//or		demo1 obj1=new demo1();
		Runnable obj=new demo();
		Runnable obj1=new demo1();
	
		Thread t1 =new Thread(obj);
		Thread t2 =new Thread(obj1);
		t1.start();
		t2.start();
	}

}
