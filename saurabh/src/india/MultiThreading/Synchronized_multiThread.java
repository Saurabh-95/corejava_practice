package india.MultiThreading;

public class Synchronized_multiThread 
{
	public static void main(String[] args) throws InterruptedException
	{
		counter r=new counter();
		Thread t1=new Thread(r);
		Thread t2=new Thread(r);
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		System.out.println("count:"+r.count);
		
	} 
	


}
class counter implements Runnable
{
	int count;
	synchronized void increament()
	{
		count++;
	}
	public void run()
	{
		for(int i=1;i<=1000;i++)
		{
			increament();
		}
		
	}
}
