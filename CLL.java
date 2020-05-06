import java.util.*;

class CLL
{
	Node head;
	Node tail;
	
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
			temp.next = this.head;
			
			this.tail = temp;
		}
		else
		{	
			temp.next = this.head;
			this.tail.next = temp;
			
			this.tail = temp;
			
		}
	}
	
	void display(Node head)
	{
		if(head == null)
		{
			System.out.println("Empty");
		}
		else
		{
			Node p = head;
			
			while(p != tail)
			{
				System.out.print(p.data+" ");
				p = p.next;
			}
			
			System.out.println(p.data);
		}
	}
	
	void insertAtHead(Node head,int data)
	{
		Node temp = new Node(data);
		
		if(head == null)
		{
			this.head = temp;
			temp.next = this.head;
			
			this.tail = temp;
		}
		else
		{
			temp.next = this.head;
			this.head = temp;
			
			this.tail.next = this.head;
		}
	}
	
	void insertAtPos(Node head,int d,int pos)
	{
		int c = this.count(this.head);
		Node temp = new Node(d);
		
		if(pos == 1)
		{
			if(head == null)
			{
				this.head = temp;
				temp.next = this.head;
				
				this.tail = temp;
			}
			else
			{
				temp.next = this.head;
				this.head = temp;
				
				this.tail.next = this.head;
			}
		}
	    else if(pos > c)
		{
			temp.next = this.head;
			this.tail.next = temp;
			this.tail = temp;
		}
		else
		{
			int i=2;
			Node p = head;
			
			while(i< pos && p.next != this.tail)
			{
				p = p.next;
				i++;
			}
			
			temp.next = p.next;
			p.next = temp;
		}
				
				
				
					
	}
		
	
	int count(Node head)
	{
		if(head == null)
		{
			System.out.println("Empty List");
		}
		else if(head == this.tail )
		{
			return 1;
		}
		else
		{
			return 1 + count(head.next);
		}
		
		return 0;
	}
		
		
	void deleteAtHead(Node head)
	{
		if(head == null)
		{
			System.out.println("empty");
		}
		else
		{
			this.head = this.head.next;
			this.tail.next = this.head;
		}
	}
			
	void deleteAtTail(Node head)
	{
		if(this.head == this.tail || (this.head == null && this.tail == null) )
		{
			this.head = null;
			this.tail = null;
		}
		else
		{
			Node p = head;
			
			while(p.next.next != this.tail)
			{
				p = p.next;
			}
			
			this.tail = p.next;
		}
	}
	
	void deleteAtPos(Node head,int pos)
	{
		int count = this.count(this.head);
		
		if(pos == 1)
		{
			if(this.head == this.tail || (this.head == null && this.tail == null) )
			{
				this.head = null;
				this.tail = null;
			}
			else
			{
				this.head = this.head.next;
				this.tail.next = this.head;
			}
		}
		else if(pos >= count)
		{
			Node p = head;
			
			while(p.next.next != this.tail)
			{
				p = p.next;
			}
			
			this.tail = p.next;
			this.tail.next = this.head;
		}
		else
		{
			int i=2;
			Node p = head;
			
			while(i< pos && p.next.next != this.tail)
			{
				p = p.next;
				i++;
			}
			
			p.next = p.next.next;
		}
				
			
	}
				
	void reversePrint(Node head)
	{
		if(head == this.tail)
		{
			System.out.print(head.data+" ");
			//System.out.println(head.next.data);
			return;
		}
		else
		{
			reversePrint(head.next);
			
			System.out.print(head.data+" ");
		}
	}
	
	void reverseRecursive(Node head)
	{
		if(head == this.tail)
		{
			Node temp = this.head;
			
			this.head = head;
			this.tail = temp;
			return;
		}
		else
		{
			reverseRecursive(head.next);
			
			head.next.next = head;
			head.next = null;
		}
	}
			
			
	void reverse(Node head)
	{
		if(head == null && this.tail == null || (this.head == this.tail) )
		{
			System.out.println("Empty list");
		}
		else
		{
			Node prev = null;
			Node curr = head;
			
			while(prev != this.tail)
			{
				Node link = curr.next;
				curr.next = prev;
				prev = curr;
				curr = link;
			}
			
			Node temp = this.head;
			
			this.head = prev;
			this.tail = temp;
		}
	}
			
			
			
			
			
			
			
			
	
	
	
	public static void main(String args[])
	{
		CLL obj = new CLL();
		obj.insertAtEnd(obj.head,1);
		obj.insertAtEnd(obj.head,2);
		obj.insertAtEnd(obj.head,3);
		obj.insertAtEnd(obj.head,4);
		obj.insertAtEnd(obj.head,5);
		obj.insertAtEnd(obj.head,6);
		obj.insertAtEnd(obj.head,7);
		obj.insertAtEnd(obj.head,8);
		
		obj.insertAtHead(obj.head,11);
		obj.insertAtHead(obj.head,12);
		
		//obj.insertAtPos(obj.head,1000,11);
		
		//System.out.println(obj.head.data);
		//System.out.println(obj.tail.data);
		//obj.display(obj.head);
		
		
		//obj.deleteAtHead(obj.head);
		//obj.deleteAtTail(obj.head);
		//obj.deleteAtTail(obj.head);
		
		//obj.deleteAtPos(obj.head,6);
		
		//System.out.println(obj.head.data);
		//System.out.println(obj.tail.data);
		
		obj.display(obj.head);
		//obj.reversePrint(obj.head);
		//System.out.println();
		
		//obj.reverseRecursive(obj.head);
		
		obj.reverse(obj.head);
		obj.display(obj.head);
		
		
	}
}
		
		
		
		
		
		
		
		
		
		
		
		