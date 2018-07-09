package india.MultiThreading;

class A
{
	int num;
	boolean valueSet=false;
	synchronized void put(int num)
	{
		while(valueSet)
		{
			try {wait();}catch(Exception e){}
		}
		System.out.println("put :"+num);
		this.num=num;
		valueSet=true;
		notify();
		
	}
	synchronized void get()
	{
		while(!valueSet)
		{
			try {wait();}catch(Exception e){}
		}
		System.out.println("get :"+num);
		valueSet=false;
		notify();
	}
}
class Producer implements Runnable
{
	A a;
	public Producer(A a)
	{
		this.a=a;
		Thread t=new Thread(this, "producer");
		t.start();
	}
	@Override
	public void run() 
	{
		int i=0;
		while(true)
		{
			a.put(i++);
			try {Thread.sleep(1500);}catch(Exception e) { }
		}	
	}
	
}
class Consumer implements Runnable
{
	A a;
	public Consumer(A a)
	{
		this.a=a;
		Thread t=new Thread(this, "Consumer");
		t.start();
	}
	public void run()
	{
		while (true) 
		{
			a.get();
			try {Thread.sleep(2000);}catch(Exception e) { }
			
		}
		
	}
}

public class InternThreadcomm 
{
	public static void main(String[] args) 
	{
		A ab=new A();
		new Producer(ab);
		new Consumer(ab); 
		
	}
	
}
