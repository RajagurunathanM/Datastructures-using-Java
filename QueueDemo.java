import java.util.*;

class QueueDemo
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
		
		if(front == null)
		{
			this.front = temp;
			this.rear = temp;
		}
		else
		{
			this.rear.next = temp;
			this.rear = temp;
		}
	}
	
	void dequeue(Node front,Node rear)
	{
		if(front == null && rear == null)
		{
			System.out.println("Empty Queue");
		}
		else
		{
			this.front = front.next;
		}
	}
			
			
			
			
	
	
	void display(Node front,Node rear)
	{
		if(front == null && rear == null)
		{
			System.out.println("Empty Queue");
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
	
	int getFront(Node front,Node rear)
	{
		if(front == null && rear == null)
		{
			System.out.println("Empty queue");
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
			System.out.println("Empty queue");
			return -1;
		}
		else
		{
			return this.rear.data;
		}
	}
	
	boolean isEmpty(Node front,Node rear)
	{
		if(front == null && rear == null)
		{
			return true;
		}
		
		return false;
	}
	
	
	
	public static void main(String args[])
	{
		QueueDemo obj = new QueueDemo();
		obj.enqueue(1,obj.front,obj.rear);
		obj.enqueue(2,obj.front,obj.rear);
		obj.enqueue(3,obj.front,obj.rear);
		obj.enqueue(4,obj.front,obj.rear);
		obj.enqueue(5,obj.front,obj.rear);
		obj.enqueue(6,obj.front,obj.rear);
		
		
		obj.display(obj.front,obj.rear);
		
		/*obj.dequeue(obj.front,obj.rear);
		obj.dequeue(obj.front,obj.rear);
		obj.dequeue(obj.front,obj.rear);
		
		obj.display(obj.front,obj.rear);*/
		
		System.out.println(obj.getFront(obj.front,obj.rear));
		
		System.out.println(obj.getRear(obj.front,obj.rear));
		
	}
}
		