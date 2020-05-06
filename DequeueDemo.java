import java.util.*;

class DequeueDemo
{
	Node front;
	Node rear;
	
	static class Node
	{
		int data;
		Node prev;
		Node next;
		
		Node(int d)
		{
			data = d;
		}
	}
	
	
	void addFirst(int val,Node front,Node rear)
	{
		Node temp = new Node(val);
		
		if(front == null && rear == null)
		{
			this.front = temp;
			this.rear = temp;
		}
		else
		{
			temp.next = this.front;
			temp.prev = null;
			this.front = temp;
		}
	}
	
	void addLast(int val,Node front,Node rear)
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
			temp.prev = this.rear;
			temp.next = null;
			this.rear = temp;
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
	
	void deleteFirst(Node front,Node rear)
	{
		if(front == null && rear == null)
		{
			System.out.println("Queue Empty");
		}
		else
		{
			this.front = front.next;
		}
	}
	
	void deleteLast(Node front,Node rear)
	{
		if(front == null && rear == null)
		{
			System.out.println("Queue Empty");
		}
		else
		{
			this.rear.prev.next = null;
			this.rear = this.rear.prev;
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
	
	int getFirst(Node front,Node rear)
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
	
	int getLast(Node front,Node rear)
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
		DequeueDemo obj = new DequeueDemo();
		obj.addFirst(1,obj.front,obj.rear);
		obj.addFirst(2,obj.front,obj.rear);
		obj.addFirst(3,obj.front,obj.rear);
		obj.addFirst(4,obj.front,obj.rear);
		
		//obj.display(obj.front,obj.rear);
		
		
		obj.addLast(5,obj.front,obj.rear);
		obj.addLast(6,obj.front,obj.rear);
		obj.addLast(7,obj.front,obj.rear);
		
		//obj.display(obj.front,obj.rear);
		
		obj.deleteFirst(obj.front,obj.rear);
		/*obj.deleteFirst(obj.front,obj.rear);
		
		obj.display(obj.front,obj.rear);
		
		obj.deleteLast(obj.front,obj.rear);*/
		obj.deleteLast(obj.front,obj.rear);
		
		obj.display(obj.front,obj.rear);
		System.out.println(obj.isEmpty(obj.front,obj.rear));
		
		System.out.println(obj.getFirst(obj.front,obj.rear));
		System.out.println(obj.getLast(obj.front,obj.rear));
		
	}
}