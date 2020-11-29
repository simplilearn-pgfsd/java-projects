package com.simplilearn.workshop;

public class Application {
	class Node {
		int data;
		Node prev;
		Node next;

		Node(int data) {
			this.data = data;
		}
	}

	public static void main(String[] args) {
		// create an instance of Application
		Application instance = new Application();
		instance.append(6);
		instance.push(7);
		instance.push(1);
		instance.append(4);

		instance.insertAfter(instance.head.next, 8);
		
		
		System.out.println("created doubly linked list :");
		instance.printList(instance.head);
	}

	private void printList(Node node) {
		
		Node last = null;
		System.out.println("Traversal in forwad direction :");
		while ( node != null) {
			System.out.print(node.data + "  ");
			last = node;
			node = node.next;
		}
		System.out.println();
		System.out.println("Traversal in reverse direction :");

		while (last != null) {
			System.out.print(last.data + "  ");
			last = last.prev;
		}
	}

	private void insertAfter(Node prev_node, int new_data) {
		if (prev_node == null) {
			System.out.println("the given previous node cannot be NULL");
			return;
		}
		
		Node new_node = new  Node(new_data);
		new_node.next = prev_node.next;
		prev_node.next = new_node;
		new_node.prev = prev_node;
		
		if (new_node.next != null) {
			new_node.next.prev = new_node;
		}
	}

	private void push(int new_data) {
		Node new_node = new Node(new_data);
		new_node.next = head;
		new_node.prev = null;

		if (head != null) {
			head.prev = new_node;
		}

		head = new_node;
	}

	private Node head;

	private void append(int new_data) {
		Node new_node = new Node(new_data);
		Node last = head;
		new_node.next = null;

		if (head == null) {
			new_node.prev = null;
			head = new_node;
			return;
		}
		while (last.next != null) {
			last = last.next;
		}
		last.next = new_node;
		new_node.prev = last;

	}

}
