import java.util.*;

class ReverseDLL
{
	Node head;
	
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
	
	void insert(Node head,int val)
	{
		Node temp = new Node(val);
		
		if(head == null)
		{
			this.head = temp;
		}
		else
		{
			Node p = head;
			
			while(p.next != null)
			{
				p = p.next;
			}
			
			p.next = temp;
			temp.prev = p;
			temp.next = null;
		}
	}
	
	void display(Node head)
	{
		if(head == null)
		{
			System.out.println();
			return;
		}
		else
		{
			System.out.print(head.data+" ");
			
			display(head.next);
		}
	}
	
	void reverse(Node head)
	{
		Node p = head;
		Node temp = null;
			
		while(p != null)
		{
			temp = p.prev;
			p.prev = p.next;
			p.next = temp;
				
			p = p.prev;
		}
		
		if(temp != null)
		{
			this.head = temp.prev;
		}	
			
	}
	
	void recursive(Node head)
	{
		if(head == null)
		{
			return;
		}
		
		Node temp = head.prev;
		head.prev = head.next;
		head.next = temp;
		
		if(head.prev == null)
		{
			this.head = head;
			return;
		}
		
		recursive(head.prev);
	}
		
	int count(Node head)
	{
		if(head.next == null)
		{
			return 1;
		}
		else
		{
			return 1 + count(head.next);
		}
	}
		
		
		
	public static void main(String args[])
	{
		ReverseDLL obj = new ReverseDLL();
		
		for(int i=0;i<10;i++)
		{
			obj.insert(obj.head,i);
		}
		
		obj.display(obj.head);
		
		//obj.reverse(obj.head);
		
		//obj.display(obj.head);
		
		//obj.recursive(obj.head);
		
		//obj.display(obj.head);
		
		System.out.println(obj.count(obj.head));
	}
}
			
			
			
			
			
			
			
			
			
			
				
				
				
				
				
				
				
				
				
				
				
				
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		