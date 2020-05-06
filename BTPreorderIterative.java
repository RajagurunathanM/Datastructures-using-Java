import java.util.*;

class BTIterative
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
	
	void buildtree()
	{
		Node first = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);
		Node fourth = new Node(4);
		Node fifth = new Node(5);
		
		this.root = first;
		first.left = second;
		first.right = third;
		second.left = fourth;
		second.right = fifth;
	}
		
	
	void preorder(Node root)
	{
		if(root == null)
		{
			return;
		}
		else
		{
			Stack<Node> st = new Stack<Node>();
			st.push(root);
			
			while(st.size() != 0)
			{
				Node temp = st.pop();
				System.out.print(temp.data+" ");
				
				if(temp.right != null)
				{
					st.push(temp.right);
				}
				if(temp.left != null)
				{
					st.push(temp.left);
				}
			}
			
		}
	}
			
	
	
	public static void main(String args[])
	{
		BTPreorderIterative b = new BTPreorderIterative();
		b.buildtree();
		
		b.preorder(b.root);
	}
}
		
		
		
		
		
		