import java.util.*;

class SLL
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
	
	void insertAtEnd(Node head,int val)
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
		}
	}
	
	void display(Node head)
	{
		if(head == null)
		{
			System.out.print("empty list");
		}
		else
		{
			Node p = head;
			
			while(p.next != null)
			{
				System.out.print(p.data+" ");
				p = p.next;
			}
			
			System.out.println(p.data);
		}
	}
	
	void insertAtFront(Node head,int val)
	{
		Node temp = new Node(val);
		
		if(head == null)
		{
			this.head = temp;
		}
		else
		{
			temp.next = this.head;
			this.head = temp;
		}
	}
	
	int len(Node head)
	{
		int count = 1;
		
		if(head == null)
		{
			return 0;
		}
		else
		{
			count = 1;
			
			Node p = head;
			
			while(p.next != null)
			{
				count++;
				p = p.next;
			}
		}
		
		return count;
		
	}
	
	void insertAtPos(Node head,int val,int pos)
	{
		Node temp = new Node(val);
		
		int l = this.len(head);
		
		if(pos == 1)
		{
			temp.next = this.head;
			this.head = temp;
			return;
		}
		if(pos > l || pos < 1)
		{
			System.out.println("Invalid position");
			return;
		}
		
		Node p = head;
		
		for(int i=0;i<pos-2;i++)
		{
			p = p.next;
		}
		
		temp.next = p.next;
		p.next = temp;
		
	}
			
	void deleteFront(Node head)
	{
		if(head == null)
		{
			System.out.println("empty list");
			return;
		}
		
		this.head = this.head.next;
	}
	
	void deleteEnd(Node head)
	{
		if(head == null)
		{
			System.out.println("empty list");
			return;
		}
		
		if(head.next == null)
		{
			this.head = null;
			return;
		}
		
		Node p = head;
		
		while(p.next.next != null)
		{
			p = p.next;
		}
		
		p.next = null;
	}
		
	void deletePos(Node head,int pos)
	{
		int l = this.len(this.head);
		
		if(pos == 1)
		{
			this.head = head.next;
			return;
		}
		
		if(pos > l)
		{
			System.out.println("Invalid position");
			return;
		}
		
		Node p = head;
		
		for(int i=0;i<pos-2;i++)
		{
			p = p.next;
		}
		
		p.next = p.next.next;
		
	}
	
	
	void deleteVal(Node head,int val)
	{
		if(head == null)
		{
			System.out.println("Empty list");
			return;
		}
		
		if(head.data == val)
		{
			this.head = head.next;
			return;
		}
		
		Node p = head;
		
		while(p.next.data != val && p.next.next != null)
		{
			p = p.next;
		}
		if(p.next.data == val)
		{
			p.next = p.next.next;
			return;
		}
		
		System.out.println("NO element found");
		
	}
	
	void reverse(Node head)
	{
		Node prev = null;
		Node curr = head;
		
		while(curr != null)
		{
			Node next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		
		this.head = prev;
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
	
	void BubbleSort(Node head)
	{
		Node p = head;
		Node q = head;
		
		while(p.next != null)
		{
			q = head;
			
			while(q.next != null)
			{
				if(q.data > q.next.data)
				{
					int temp = q.data;
					q.data = q.next.data;
					q.next.data = temp;
				}
				
				q = q.next;
			}
			
			p = p.next;
		}
		
	}
		
	

	
	public static void main(String args[])
	{
		SLL obj = new SLL();
		
		obj.insertAtEnd(obj.head,1);
		obj.insertAtEnd(obj.head,2);
		obj.insertAtEnd(obj.head,3);
		
		obj.insertAtFront(obj.head,4);
		obj.insertAtFront(obj.head,5);
		obj.insertAtFront(obj.head,6);


		obj.insertAtPos(obj.head,1000,1);
		obj.insertAtPos(obj.head,1000,2);
		obj.insertAtPos(obj.head,2222,3);
		
		int len = obj.len(obj.head);
		System.out.println(len);
		
		obj.display(obj.head);
		
		obj.deleteFront(obj.head);
		obj.display(obj.head);
		
		obj.deleteEnd(obj.head);
		obj.display(obj.head);
		
		obj.deletePos(obj.head,7);
		obj.display(obj.head);
		
		obj.deleteVal(obj.head,1);
		obj.display(obj.head);
		
		obj.reverse(obj.head);
		obj.display(obj.head);
		
		obj.SelectSort(obj.head);
		obj.display(obj.head); 
		
		obj.BubbleSort(obj.head);
		obj.display(obj.head);
		
		
	}
}

		