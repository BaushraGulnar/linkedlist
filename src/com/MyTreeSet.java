package com;

public class MyTreeSet {
	static class Node{
		Object data;
		Node left;
		Node right;
		Node(Object data)
		{
			this.data=data;
		}
		
	}
	Node root;
	public boolean add(Comparable data)
	{
		if(root==null)
		{
			root=new Node(data);
			return true;
		}
		return add(root,data);
	}
	public boolean add(Node root, Comparable data) {
		if(data.compareTo(root.data)>0)
		{
			if(root.right!=null)
			{
				add(root.right,data);
				return true;
			}
			root.right=new Node(data);
			return true;
		}
			else if(data.compareTo(root.data)<0)
			{
				if(root.left!=null)
				{
					add(root.left,data);
					return true;
				}
				root.left=new Node(data);
				return true;
			}
		return false;
			
		
	}
	public void printInorder()
	{
		inOrder(root);
		System.out.println();
	}
	void inOrder(Node root) {
		if(root==null)
			return;
		inOrder(root.left);
		System.out.println(root.data);
		inOrder(root.right);
	}

}
