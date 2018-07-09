package india.MultiThreading;


class demo2 implements Runnable
{
	public void run()
	{
		for(int i=0;i<=4;i++)
		{
			System.out.println("abc");
		try {Thread.sleep(1000);}catch(Exception e) {}
		}
	}
}
class demo3 implements Runnable
{
	public void run()
	{
		for(int i=0;i<=4;i++)
		{
			System.out.println("bbc" +Thread.currentThread().getPriority());
		try {Thread.sleep(1005);}catch(Exception e) {}
		}
	}
}



public class Join_Alive_method 
{
	public static void main(String[] args) throws InterruptedException 
	{
		Runnable obj=new demo2();
		Runnable obj1=new demo3();
		Thread t1=new Thread(obj);
		Thread t2 =new Thread(obj1);
		Thread t3=new Thread(obj);
		//t1.setName("demo2 thread"); use for set and get the thread names
		//t2.setName("demo3 theard");
		//System.out.println(t1.getName());
		//System.out.println(t2.getName());
		
		System.out.println(t1.getPriority());
		System.out.println(t2.getPriority());
		System.out.println(t3.getPriority());
		t1.getName();
		t1.start();
		t2.start();
		t1.join();
		
		t2.join();
		System.out.println(t2.isAlive());
		System.out.println("xyz");
		
	}
}
