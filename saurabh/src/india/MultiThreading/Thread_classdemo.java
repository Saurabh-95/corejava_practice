package india.MultiThreading;

class Hi1 extends Thread
{
	public void run() 
	{
		for(int i=0;i<=4;i++) 
		{
			System.out.println("hi saurabh");
		try {Thread.sleep(505);}catch(Exception e) {}
		}
	}
}
class Hello1 extends Thread
{
	public void run()  
	{
		for(int i=0;i<=4;i++)
		{
			System.out.println("hello saurabh");
		try {Thread.sleep(500);}catch(Exception e) {}
		}
	}
}
public class Thread_classdemo
{
	public static void main(String[] args) 
	{
		Hi1 obj=new Hi1();
		Hello1 obj1=new Hello1();
		obj.start(); //start only run() method so we need change the name of method
		obj1.start();
	}
}
