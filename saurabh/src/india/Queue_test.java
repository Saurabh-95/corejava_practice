package india;

public class Queue_test 
{
	static int A[]=new int[5];
	static int rear=-1;
	static int front=-1;
	static int size=A.length;
	
	void Enqueue(int x)
	{
		if(front==-1) 
		{
			front++;
		}
		if(rear==size-1)
		{
			System.out.println("queue is full");
			
		}
		else
		{
			rear=rear+1;
			A[rear]=x;
			System.out.println("inserted element is ");
			for(int i=front;i<=rear;i++)
			{
				System.out.println(A[i]);
			}
		}
	}
	
	int Dequeue()
	{
	front=front+1;
	
		System.out.println("after deletion avail element is ");	
		for(int i=front;i<=rear;i++)
		{
			System.out.println(A[i]);
			
		}
		return A[front];
	}
	public static void main(String[] args) 
	{
		Queue_test queue=new Queue_test();
		queue.Enqueue(5);
		queue.Enqueue(6);
		queue.Enqueue(7);
		queue.Enqueue(8);
		queue.Enqueue(9);
		
		queue.Dequeue();
		queue.Dequeue();
		queue.Dequeue();
		queue.Dequeue();
		
		
	}

}
