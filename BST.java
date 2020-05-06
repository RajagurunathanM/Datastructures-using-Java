import java.util.*;

class BST
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
			return;
		}
		if(root.left == null)
		{
			root.left = temp;
			return;
		}
		if(root.right == null)
		{
			root.right = temp;
			return;
		}
		if(val < root.data)
		{
			insert(root.left,val);
		}
		if(val > root.data)
		{
			insert(root.right,val);
			
		}
		
		
	}
	
	void inorder(Node root)
	{
		if(root == null)
		{
			//System.out.println();
			return;
		}
		else
		{
			inorder(root.left);
			System.out.print(root.data+" ");
			inorder(root.right);
		}
	}
		
	void preorder(Node root)
	{
		if(root == null)
		{
			//System.out.println();
			return;
		}
		else
		{
			System.out.print(root.data+" ");
			preorder(root.left);
			preorder(root.right);
		}
	}
	
	void postorder(Node root)
	{
		if(root == null)
		{
			return;
		}
		else
		{
			postorder(root.left);
			postorder(root.right);
			System.out.print(root.data+" ");
		}
	}
	
	void traverse(Node root)
	{
		if(root == null)
		{
			return;
		}
		else
		{
			System.out.print(root.data+" ");
			traverse(root.right.left);
		}
	}

	
	public static void main(String args[])
	{
		BST bt = new BST();
		
		for(int i=1;i<6;i++)
		{
			bt.insert(bt.root,i);
		}
		
		/*bt.inorder(bt.root);
		
		System.out.println();
		
		bt.preorder(bt.root);
		
		System.out.println();
		
		bt.postorder(bt.root);*/
		
		bt.traverse(bt.root);
		
		System.out.println();
		
	}
}
			
			
			
			
			
			
			
			
			
			
	
	