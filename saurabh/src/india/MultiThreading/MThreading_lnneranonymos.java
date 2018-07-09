package india.MultiThreading;

public class MThreading_lnneranonymos 
{
	public static void main(String[] args)
	{
		Runnable obj=new Runnable() 
		{
			@Override
			public void run()
			{
				for(int i=0;i<=4;i++)
				{
					System.out.println("hi");
				try {Thread.sleep(1000);}catch(Exception e) {}
				}
			}
		};
		Runnable obj1=new Runnable() 
		{
			@Override
			public void run()
			{
				for(int i=0;i<=4;i++)
				{
					System.out.println("bye");
				try {Thread.sleep(1000);}catch(Exception e) {}
				}
			}
		};
		Thread t1=new Thread(obj);
		Thread t2=new Thread(obj1);
		t1.start();
		t2.start();
		
		
	}
}
