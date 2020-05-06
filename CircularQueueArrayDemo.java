import java.util.*;

class CircularQueueArrayDemo
{
	static int[] cq = new int[5];
	static int front=-1;
	static int rear=-1;
	
	void enqueue(int val)
	{
		if((rear+1)%cq.length == front)
		{
			System.out.println("Queue Full");
			return;
		}
		else if(front == -1 && rear == -1)
		{
			front = 0;
			rear = 0;
		}
		else if(rear == cq.length-1 && front != 0)
		{
			rear = 0;
		}
		else
		{
			rear = (rear+1)%cq.length;
		}
		
		cq[rear] = val;
	}
	
	void dequeue()
	{
		if(front == -1 && rear == -1)
		{
			System.out.println("Empty Queue");
			return;
		}
		else if(front == cq.length-1 )
		{
			front = 0;
		}
		else if(front == rear)
		{
			front = -1;
			rear = -1;
		}
		else
		{
			front++;
		}
	}
	
	void display()
	{
		if(front == -1 && rear == -1)
		{
			System.out.println("Empty Queue");
		}
		else
		{
			if(front <= rear)
			{
				for(int i=front;i<=rear;i++)
				{
					System.out.print(cq[i]+" ");
				}
				System.out.println();
			}
			else
			{
				for(int i=front;i<cq.length;i++)
				{
					System.out.print(cq[i]+" ");
				}
				
				for(int i=0;i<=rear;i++)
				{
					System.out.print(cq[i]+" ");
				}
				
				System.out.println();
			}
		}
	}
		
	
	int getFront()
	{
		if(front == -1&& rear == -1)
		{
			//System.out.println("Queue Empty");
			return -1;
		}
		else
		{
			return cq[front];
		}
	}
	
	int getRear()
	{
		if(front == -1&& rear == -1)
		{
			//System.out.println("Queue Empty");
			return -1;
		}
		else
		{
			return cq[rear];
		}
	}
		
	
	public static void main(String args[])
	{
		CircularQueueArrayDemo obj = new CircularQueueArrayDemo();
		
		obj.enqueue(1);
		obj.enqueue(2);
		obj.enqueue(3);
		obj.enqueue(4);
		obj.enqueue(5);
		
		obj.dequeue();
		obj.dequeue();
		
		obj.enqueue(1);
		obj.enqueue(2);
		obj.enqueue(11);
		obj.enqueue(12);
		
		/*obj.enqueue(6);
		obj.enqueue(7);
		obj.enqueue(8);
		obj.enqueue(9);
		obj.enqueue(10);
		obj.enqueue(11);*/
		
		obj.display();
		
		obj.dequeue();
		obj.dequeue();
		obj.dequeue();
		obj.dequeue();
		obj.dequeue();
		
		System.out.println(obj.getFront());
		System.out.println(obj.getRear());
		
	}
}