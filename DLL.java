import java.util.*;

class DLL
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
	
	void insertAtHead(Node head,int d)
	{
		Node temp = new Node(d);
		
		if(head == null)
		{
			this.head = temp;
		}
		else
		{
			temp.next = head;
			temp.prev = null;
			
			this.head = temp;
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
	
	void insertAtEnd(Node head,int d)
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
			temp.prev = p;
		}
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
	
	
	
		
	void insertAtPos(Node head,int val,int pos)
	{
		int count = this.count(head);
		
		Node temp = new Node(val);
		
		if(pos == 1)
		{
			if(head == null)
			{
				this.head = temp;
			}
			else
			{
				temp.next = head;
				temp.prev = null;
				this.head = temp;
			}
		}
		else if(pos > count)
		{
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
				
				temp.next = p.next;
				p.next = temp;
				temp.prev = p;
			}
			
		}
		else
		{
			int i = 2;
			Node p = head;
			
			while(i < pos && p.next != null)
			{
				p = p.next;
				i++;
			}
			
			temp.next = p.next;
			p.next = temp;
			temp.prev = p;
		}
		
	}	

	void deleteAtHead(Node head)
	{
		if(head == null)
		{
			return;
		}
		else
		{
			this.head = head.next;
			this.head.prev = null;
		}
	}
	
	void deleteAtEnd(Node head)
	{
		if(head == null)
		{
			return;
		}
		else
		{
			Node p = head;
			
			while(p.next.next != null)
			{
				p = p.next;
			}
			
			p.next = null;
		}
	}
		
		
	void deleteAtPos(Node head,int pos)
	{
		int count = this.count(head);
		
		if(pos == 1)
		{
			if(head == null)
			{
				return;
			}
			else
			{
				this.head = head.next;
				this.head.prev = null;
			}
		}
		else if(pos >= count)
		{
			Node p = head;
			
			while(p.next.next != null)
			{
				p = p.next;
			}
			
			p.next = null;
		}
		else
		{
			int i = 2;
			Node p = head;
			
			while(i < pos && p.next != null)
			{
				p = p.next;
				i++;
			}
			
			p.next.next.prev = p.next.prev;
			p.next = p.next.next;
				
		}
		
	}
	
	void reverseDisplay(Node head)
	{
		if(head == null)
		{
			System.out.println();
			return;
		}
		else
		{
			reverseDisplay(head.next);
			
			System.out.print(head.data+" ");
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
	
	
		
	
	public static void main(String args[])
	{
		DLL obj = new DLL();
		
		/*for(int i=1;i<10;i++)
		{
			obj.insertAtHead(obj.head,i);
		}
		*/
		for(int i=10;i<20;i++)
		{
			obj.insertAtEnd(obj.head,i);
		}
		
		
		obj.insertAtPos(obj.head,33,13);
		
		obj.display(obj.head);
		
		System.out.println( obj.count(obj.head) );
		
		/* obj.deleteAtHead(obj.head);
		
		obj.display(obj.head);
		
		obj.deleteAtEnd(obj.head);
		obj.deleteAtEnd(obj.head);
		obj.deleteAtEnd(obj.head);
		
		obj.display(obj.head);
		
		System.out.println("--------------------");
		System.out.println( obj.count(obj.head) );
		
		obj.deleteAtPos(obj.head,16);
		
		obj.display(obj.head); */
		
		//obj.reverseDisplay(obj.head);
		
		obj.reverse(obj.head);
		
		obj.display(obj.head);
			
	}
}
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		
		
		