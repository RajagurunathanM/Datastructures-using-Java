import java.util.*;

class BinaryTreeDemo
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
	
	void buildTree()
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
			System.out.print(root.data+" ");
			preorder(root.left);
			preorder(root.right);
		}
	}
	
	
	void inorder(Node root)
	{
		if(root == null)
		{
			return;
		}
		else
		{
			inorder(root.left);
			System.out.print(root.data+" ");
			inorder(root.right);
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
	
	
	
	public static void main(String args[])
	{
		BinaryTreeDemo b = new BinaryTreeDemo();
		b.buildTree();
		b.inorder(b.root);
		System.out.println();
		b.preorder(b.root);
		System.out.println();
		b.postorder(b.root);
		System.out.println();
		
	}
}
		
		
	
		
		
		
		