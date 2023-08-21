package com.home.datastructure.linkedlist;

public class RunLinkedListApp {
	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.addFirst(2);
		ll.addFirst(6);
		ll.addFirst(35);
		ll.addLast(40);
		ll.addLast(87);
		ll.addFirst(65);
		System.out.println("First Element: " + ll.getFirst());
		System.out.println("Last Element: " + ll.getLast());
		ll.addLast(94);
		//ll.add(8, 45);
		ll.add(3, 71);
		ll.addFirst(34);
		ll.add(5, 24);
		System.out.println("First Element: " + ll.getFirst());
		System.out.println("Last Element: " + ll.getLast());
		ll.addLast(100);
		ll.add(4, 54);
		ll.print();
		System.out.println("Size: "+ ll.getSize());
		System.out.println("Removed first: " + ll.removeFirst());
		System.out.println("Removed first: " + ll.removeFirst());
		System.out.println("Removed last: " + ll.removeLast());
		System.out.println("Removed first: " + ll.removeFirst());
		System.out.println("Removed last: " + ll.removeLast());
		System.out.println("First Element: " + ll.getFirst());
		System.out.println("Last Element: " + ll.getLast());
		System.out.println("Removed first: " + ll.removeFirst());
		System.out.println("Removed last: " + ll.removeLast());
		System.out.println("Removed last: " + ll.removeLast());
		ll.add(2, 17);
		ll.addFirst(21);
		System.out.println("Removed first: " + ll.removeFirst());
		ll.addLast(99);
		System.out.println("Removed last: " + ll.removeLast());
		ll.print();
		//ll.add(-2, 71);
		System.out.println("First Element: " + ll.getFirst());
		System.out.println("Last Element: " + ll.getLast());
		System.out.println("Remove at Index: " + ll.remove(3));
		System.out.println("First StackTraceElementent: " + ll.getFirst());
		System.out.println("Last Element: " + ll.getLast());
		System.out.println("Remove at Index: " + ll.remove(0));
		ll.print();
		System.out.println("Contains: " + ll.contains(17));
		System.out.println("Index Of: " + ll.indexOf(71));

		System.out.println("Kth Element from end: " + ll.getKthNodeFromEnd(4)); 
	}
}