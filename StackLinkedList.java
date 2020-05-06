import java.util.*;

class StackLinkedList
{
	Node top;
	
	static class Node
	{
		int data;
		Node next;
		
		Node(int d)
		{
			data = d;
		}
	}
	
	void push(Node top,int val)
	{
		Node temp = new Node(val);
		
		if(top == null)
		{
			this.top = temp;
		}
		else
		{
			temp.next = top;
			this.top = temp;
		}
	}
	
	void print(Node top)
	{
		if(top == null)
		{
			System.out.println("Empty Stack, No Element to print");
		}
		else
		{
			Node p = top;
			
			while(p.next != null)
			{
				System.out.print(p.data+" ");
				p = p.next;
			}
			
			System.out.println(p.data);
		}
	}
	
	int pop(Node top)
	{
		if(top == null)
		{
			System.out.println("Stack Empty , No element to Pop");
		}
		else
		{
			int val = top.data;
			this.top = top.next;
			
			return val;
		}
		
		return -1;
	}
	
	
	int peek(Node top)
	{
		if(top == null)
		{
			System.out.println("Stack Empty , so No Top Element");
		}
		else
		{
			return top.data;
		}
		
		return -1;
	}
				
	
	public static void main(String args[])
	{
		StackLinkedList s1 = new StackLinkedList();
		StackLinkedList s2 = new StackLinkedList();
		
		s1.push(s1.top,1);
		s1.push(s1.top,2);
		s1.push(s1.top,3);
		s1.push(s1.top,4);
		
		s2.push(s2.top,11);
		s2.push(s2.top,12);
		s2.push(s2.top,13);
		s2.push(s2.top,14);
		
		//System.out.println( s1.pop(s1.top) );
		//System.out.println( s1.pop(s1.top) );
		
		s2.pop(s2.top);
		
		s1.print(s1.top);
		System.out.println( s1.peek(s1.top) );
		
		s2.print(s2.top);
		System.out.println( s2.peek(s2.top) );
		
	}
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		