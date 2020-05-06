import java.util.*;

class QueueArrayDemo
{
	static int[] arr = new int[100];
	static int size = 100;
	static int front = -1;
	static int rear = -1;
	
	void enqueue(int val)
	{
		if(front == -1 && rear == -1)
		{
			front = 0;
			rear = 0;
		}
		else if(rear == arr.length-1)
		{
			System.out.println("Queue Full");
			return;
		}
		else
		{
			rear++;
		}
	
		arr[rear] = val;
			
	}
	
	void display()
	{
		if(front == -1)
		{
			System.out.println("Queue Empty");
		}
		else
		{
			for(int i=front;i<=rear;i++)
			{
				System.out.print(arr[i]+" ");
			}
			
			System.out.println();
		}
	}
	
	
	void dequeue()
	{
		if(front == -1 && rear == -1)
		{
			System.out.println("Queue Empty");
			return;
		}
		else if(front == rear)
		{
			front = -1;
			rear = -1;
		}
		else if(front >= arr.length-1)
		{
			System.out.println("Queue Full");
		}
		else
		{
			front++;
		}
		
	}
	
	int getFirst()
	{
		if(front == -1)
		{
			return -1;
		}
		else
		{
			return arr[front];
		}
	}
	
	int getLast()
	{
		if(rear == -1)
		{
			return -1;
		}
		else
		{
			return arr[rear];
		}
	}
	
	
	public static void main(String args[])
	{
		QueueArrayDemo obj = new QueueArrayDemo();
		
		obj.enqueue(1);
		obj.enqueue(2);
		obj.enqueue(3);
		obj.enqueue(4);
		
		obj.display();
		
		obj.dequeue();
		obj.dequeue();
		
		obj.display();
		
		System.out.println(obj.getFirst());
		System.out.println(obj.getLast());
		
		
	}
}
		
		
		
		
		
		
		
		
		
	
			