import java.util.*;

class StackArray
{
	static int top = -1;
	static int size = 6;
	static int[] a = new int[size];
	
	boolean isEmpty()
	{
		if(top == -1)
		{
			return true;
		}
		
		return false;
	}
	
	boolean isFull()
	{
		if(top >= size-1)
		{
			return true;
		}
		
		return false;
	}
	
	void push(int x)
	{
		if(isFull())
		{
			System.out.println("Stack is Full");
		}
		else
		{	top++;
			a[top] = x;
		}
	}
	
	
	void pop()
	{
		if(isEmpty())
		{
			System.out.println("Stack is Empty , so Elements to pop");
		}
		else
		{
			a[top]= 0;
			top--;
		}
	}
	
	void print()
	{
		if(isEmpty())
		{
			System.out.println("Stack Empty , No element to print");
		}
		else
		{
			for(int i=top;i>=0;i--)
			{
				System.out.print(a[i]+" ");
			}
			System.out.println();
		}
	}
	
	int top()
	{
		if( isEmpty())
		{
			System.out.println("Stack Empty , No Top Element");
			return -1;
		}
		
		return a[top];
	}

		
	
	public static void main(String args[])
	{
		StackArray st = new StackArray();
		
		System.out.println(st.isEmpty());
		
		st.push(1);
		st.push(2);
		st.push(3);
		st.push(4);
		st.push(5);
		st.push(6);
		
		st.print();
		
		System.out.println(st.isFull());
		
		st.pop();
		st.pop();
		st.pop();
		
		st.print();
		
		System.out.println(st.top());
	}
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	