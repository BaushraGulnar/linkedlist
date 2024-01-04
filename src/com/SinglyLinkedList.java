package com;

public class SinglyLinkedList {
	class Node{
		Node next;
		Object data;
		Node(Object data)
		{
			this.data=data;
		}
	}
	Node head;
	public void add(Object data)
	{
		Node n=new Node(data);
		if(head==null)
		{
			head=n;
			return;
		}
		Node temp=head;
		while(temp.next!=null)
		{
			temp=temp.next;
		}
		temp.next=n;
	}
	public String toString()
	{
		String str="";
		Node t=head;
		while(t!=null)
		{
			str=str+t.data;
		
		if(t.next!=null)
		{
			str=str+"->";
		}
		t=t.next;
	}
	
	return str;
	}
	public void addFirst(Object data)
	{
		Node n=new Node(data);
		n.next=head;
		head=n;
	}
	public void addLast(Object data)
	{
		Node n=new Node(data);
		Node temp=head;
		while(temp.next==null)
		{
			temp.next=n;
		}
	
	}
	public Object deleteFirst()
	{
		Object data=head.data;
		head=head.next;
		return data;
	}
	public void deleteLast() {
		if(head==null)
		{
			System.out.println("list is empty");
			return ;
		}
		else if(head.next==null)
		{
			head=null;
		}
		else if(head.next!=null)
		{
			Node curr=head;
			while(curr.next.next!=null)
			{
				curr=curr.next;
			}
			curr.next=null;
		}
	}
	
	}


