package com;

public class MainRunner1 {
	public static void main(String[] args) {
		SinglyLinkedList sl=new SinglyLinkedList();
		sl.add(25);
		sl.add(56);
		sl.add(78);
		sl.add(89);
		System.out.println(sl);
		sl.addFirst(26);
		System.out.println(sl);
		sl.addLast(20);
		sl.deleteLast();
	System.out.print(sl);
	}

}
