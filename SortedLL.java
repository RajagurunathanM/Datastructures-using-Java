import java.util.*;

class SortedLL
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
	
	void insert(Node head,int val)
	{
		Node temp = new Node(val);
		
		if(head == null)
		{
			this.head =temp;
			return;
		}
		else if(temp.data <= head.data)
		{
			temp.next = head;
			this.head = temp;
			return;
		}
		else
		{
			Node p =head;
			
			while(p != null )
			{
				if(p.data <= temp.data && (p.next.data > temp.data || p.next == null))
				{
					temp.next = p.next;
					p.next = temp;
					
					return;
				}
				p = p.next;
			}
			
		}
		
	}
	
	void display(Node head)
	{
		if(head == null)
		{
			System.out.println("Empty list");
			return;
		}
		else
		{
			Node p = head;
			
			while(p != null)
			{
				System.out.print(p.data+" ");
				p = p.next;
			}
			
			System.out.println();
		}
	}
	
	public static void main(String args[])
	{
		SortedLL obj = new SortedLL();
		
		for(int i=0;i<6;i++)
		{
			obj.insert(obj.head,i);
		}
		
		obj.display(obj.head);
	}
}
