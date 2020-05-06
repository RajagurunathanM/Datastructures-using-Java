import java.util.*;

class DeleteDuplicateLL
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
			p.next = temp;
		}
	}
	
	void display(Node head)
	{
		if(head.next == null)
		{
			System.out.println(head.data);
			return;
		}
		else
		{
			System.out.print(p.data+" ");
			display(head.next);
		}
	}
		
		
	public static void main(String args[])
	{
		DeleteDuplicateLL obj = new DeleteDuplicateLL();
		
		obj.insert(obj.head,1);
		obj.insert(obj.head,1);
		obj.insert(obj.head,1);
		obj.insert(obj.head,1);
		obj.insert(obj.head,1);
		obj.insert(obj.head,1);
		
		obj.display(obj.head);
	}
}
		
		
		
		
		
		
		
		
		
		
		
		
		