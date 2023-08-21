package com.home.datastructure.linkedlist;

import java.util.NoSuchElementException;

public class LinkedList {
	private Node first;
	private Node last;
	private int size = 0;

	private static class Node {
		private int data;
		private Node next;

		Node(int data) {
			this.data = data;
		}

		public int getData() {
			return data;
		}
	}

	public void addFirst(int data) {
		Node newNode = new Node(data);
		if (isEmpty()) {
			first = last = newNode;
		} else {
			newNode.next = first;
			first = newNode;
		}
		size++;
	}

	private boolean isEmpty() {
		return first == null;
	}

	public void add(int index, int data) {
		if(index < 0 || index > size) {
			throw new IndexOutOfBoundsException(String.format("Index : %s , Size : %s", index, size));
		} else if(index == 0) {
			addFirst(data);
		} else if(index == size) {
			addLast(data);
		} else {
			Node newNode = new Node(data);
			Node current = first;
			for(int i=0; i<index-1; i++) {
				current = current.next;
			}
			newNode.next = current.next;
			current.next = newNode;
			size++;
		}
	}

	public void addLast(int data) { 
		Node newNode = new Node(data);
		if (isEmpty()) {
			first = last = newNode;
		} else {
			last.next = newNode;
			last = newNode;	
		}
		size++;
	}

	public boolean add(int data) {
		int sizeBefore = size;
		addLast(data);
		if(sizeBefore != size) {
			return true;
		}
		return false;
	}

	public int removeFirst() {
		if(isEmpty()) {
			throw new NoSuchElementException();
		}

		int returnVal = first.data;

		if(first == last) {
			first = last = null;
		} else {
			Node temp = first.next;
			first.next = null;
			first = temp;
		}

		size--;
		return returnVal;
	}

	public int removeLast() {
		if(isEmpty()) {
			throw new NoSuchElementException();
		}

		int returnVal = last.data;

		if(first == last) {
			first = last = null;
		} else {
			Node previous = getPrevious(last);
			last = previous;
			previous.next = null;
		}

		size--;
		return returnVal;
	}

	private Node getPrevious(Node node) {
		Node current = first;
		while(current != null) {
			if(current.next == node) {
				return current;
			}
			current = current.next;
		}
		return null;
	} 	

	public int remove(int index) { 
		int returnVal = 0;
		if(index < 0 || index >= size) {
			throw new IndexOutOfBoundsException(String.format("Index : %s , Size : %s", index, size));
		} else if(index == 0) {
			returnVal = removeFirst();
		} else if(index == size) {
			returnVal = removeLast();
		} else {
			Node current = first;
			for(int i=0; i<index-1; i++) {
				current = current.next;
			}
			Node temp = current.next;
			returnVal = temp.data;
			current.next = temp.next;
			temp.next = null;
			size--;
		}
		return returnVal;
	}

	public int indexOf(int data) {
		Node current = first;
		int i = 0;
		while (current != null) {
			if(current.data == data) {
				return i;
			}
			current = current.next;
			i++;
		}
		return -1;
	}

	public void reverse() {
		if (isEmpty() || first.next == null) {
			return;
		}
		reverse(null, first);
	}

	private void reverse(Node previous, Node current) {
		if (current == null) {
			first = previous;
			return;
		}
		reverse(current, current.next);
		current.next = previous;
		last = current;
	}

	public void reverseLL() {
		Node prev = null;
		Node curr = first;
		while (curr != null) {
			Node next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		last = first;
		first = prev;
	}

	public int getKthNodeFromEnd(int k) {
		Node pointer1 = first;
		Node pointer2 = first;
		int diffCounter = 0;
		while (pointer1.next != null) {
			pointer1 = pointer1.next;
			diffCounter++;
			//only move pointer1 after the difference between the two pointers has been covered
			if(diffCounter > k-1) {
				pointer2 = pointer1.next;
			}
		}
		return pointer2.data;
	}

	public boolean contains(int data) {
		return indexOf(data) != -1;
	}

	public int getSize() {
		return size;
	}

	public int getFirst() {
		return first.data;
	}

	public int getLast() {
		return last.data;
	}

	public void print() {
		System.out.println("Printing List");
		Node current = first;
		while (current != null) {
			System.out.println(current.data);
			current = current.next;
		}
	}
}