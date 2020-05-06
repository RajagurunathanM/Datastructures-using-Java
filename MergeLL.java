import java.util.*;

class MergeLL
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
	
	void SelectSort(Node head)
	{
		Node p = head;
		Node q = head;

		while(p.next != null)
		{
			q = p.next;
			
			while(q != null)
			{
				if(p.data > q.data)
				{
					int temp = p.data;
					p.data = q.data;
					q.data = temp;
				}
				
				q = q.next;
			}
			
			p = p.next;
				
		}
		
				
	}
	
	
	Node merge(Node head1,Node head2)
	{
		Node p = head1;
		
		while(p.next != null)
		{
			p = p.next;
		}
		
		p.next = head2;
		
		this.SelectSort(head1);
		
		return head1;
	}
	
	
	
	public static void main(String args[])
	{
		MergeLL obj1 = new MergeLL();
		MergeLL obj2 = new MergeLL();
		
		for(int i=0;i<6;i++)
		{
			obj1.insert(obj1.head,i);
			obj2.insert(obj2.head,i);
		}
		
		obj1.display(obj1.head);
		obj2.display(obj2.head);
		
		MergeLL m = new MergeLL();
		m.head = m.merge(obj1.head,obj2.head);
		
		m.display(m.head);
		
	}
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		