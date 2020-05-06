import java.util.*;

class ReverseSLL
{
	Node head;
	
	static class Node
	{
		int data;
		Node next;
		
		Node(int d)
		{
			data = d;
		}
	}
	
	
	void insert(Node head,int d)
	{
		Node temp = new Node(d);
		
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
			
			p.next= temp;
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
	
	void reverseDisplay(Node head)
	{
		if(head == null)
		{
			return;
		}
		
		reverseDisplay(head.next);
		
		System.out.print(head.data+" ");
	}
	
	void reverse(Node head)
	{
		if(head.next == null)
		{
			this.head = head;
			return;
		}
		
		reverse(head.next);
		
	    head.next.next = head;
		head.next = null;
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
		ReverseSLL obj = new ReverseSLL();
		
		for(int i=0;i<10;i++)
		{
			obj.insert(obj.head,i);
		}
		
		
		obj.reverse(obj.head);
		
		obj.display(obj.head);
		
		int c = obj.count(obj.head);
		System.out.println(c);
		
		//obj.reverseDisplay(obj.head);
		
	}
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	
	
		
		
		
		
		
		
		
		
		
		
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			