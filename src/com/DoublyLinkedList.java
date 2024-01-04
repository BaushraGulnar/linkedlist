package com;

public class DoublyLinkedList {
	static class Node{
		Object data;
		Node next,prev;
		Node(Object data)
		{
			this.data=data;
		}
	}
	Node head,tail;
	public void add(Object data)
	{
		Node n=new Node(data);
		if(head==null)
		{
			head=tail=null;
		}
		else {
			n.prev=tail;
			tail.next=n;
			tail=n;
		}
	}
	public String toString()
	{
		String str="";
		Node t=head;
		while(t!=null)
		{
			str=str+t.data;
			if(t.next!=null) {
				str=str+"->";
			}
			t=t.next;
		}
		return str;
	}
}
