package com;

public class MainRunner {
	static class Node{
		Node next;
		Object data;
		Node(Object data)
		{
			this.data=data;
		}
	}
		public static void main(String[] args) {
			Node n1= new  Node(25);
			Node n2= new  Node(56);
			Node n3= new  Node(78);
			Node n4= new  Node(89);
			Node head=n1;
			n1.next=n2;
			n2.next=n3;
			n3.next=n4;
			Node temp=head;
			while(temp!=null)
			{
				System.out.print(temp.data+" ");
				temp=temp.next;
			}
		}
	}

