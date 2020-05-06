import java.util.*;

class BSTDemo
{
	Node root;
	
	static class Node
	{
		int data;
		Node left;
		Node right;
		
		Node(int d)
		{
			data = d;
		}
	}
	
	void insert(Node root,int val)
	{
		Node temp = new Node(val);
		
		if(root == null)
		{
			this.root = temp;
		}
		else if(val < root.data)
		{
			insert(root.left,val);
		}
		else
		{
			insert(root.right,val);
		}
	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	