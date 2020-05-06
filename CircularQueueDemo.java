import java.util.*;

class CircularQueueDemo
{
	Node front;
	Node rear;
	
	static class Node
	{
		int data;
		Node next;
		
		Node(int d)
		{
			data = d;
		}
	}
	
	
	void enqueue(int val,Node front,Node rear)
	{
		Node temp = new Node(val);
		
		if(front == null && rear == null)
		{
			this.front = temp;
			this.rear = temp;
		}
		else
		{
			this.rear.next = temp;
			this.rear = temp;
			this.rear.next = this.front;
		}		
	}
	
	void display(Node front,Node rear)
	{
		if(front == null && rear == null)
		{
			System.out.println("Queue Empty");
		}
		else
		{
			Node p = front;
			
			while(p != rear)
			{
				System.out.print(p.data+" ");
				p = p.next;
			}
			
			System.out.println(p.data);
		}
	}
			
	void dequeue(Node front,Node rear)
	{
		if(front == null && rear == null)
		{
			System.out.println("Queue Empty");
		}
		else
		{
			this.front = front.next;
			
			this.rear.next = this.front;
		}
	}
			
	int getFront(Node front,Node rear)
	{
		if(front == null && rear == null)
		{
			return -1;
		}
		else
		{
			return this.front.data;
		}
	}
	
	int getRear(Node front,Node rear)
	{
		if(front == null && rear == null)
		{
			return -1;
		}
		else
		{
			return this.rear.data;
		}
	}
		
	
	public static void main(String args[])
	{
		CircularQueueDemo obj = new CircularQueueDemo();
		obj.enqueue(1,obj.front,obj.rear);
		obj.enqueue(2,obj.front,obj.rear);
		obj.enqueue(3,obj.front,obj.rear);
		obj.enqueue(4,obj.front,obj.rear);
		
		obj.display(obj.front,obj.rear);
		
		
		//obj.dequeue(obj.front,obj.rear);
		//obj.dequeue(obj.front,obj.rear);
		
		//obj.display(obj.front,obj.rear);
		
		System.out.println( obj.getFront(obj.front,obj.rear) );
		System.out.println( obj.getRear(obj.front,obj.rear) );
		
		
	}
}