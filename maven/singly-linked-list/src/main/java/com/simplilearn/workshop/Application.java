package com.simplilearn.workshop;

import java.util.LinkedList;

public class Application {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();

//		list.add(index, element);

		list = insert(list, 1);
		list = insert(list, 2);
		list = insert(list, 3);
		list = insert(list, 4);
		list = insert(list, 5);
		list = insert(list, 6);
		list = insert(list, 7);
		list = insert(list, 8);

		// print the LinkedList
		printList(list);

		// delete node with value 1
		deleteByKey(list, 1);

		// print the LinkedList
		printList(list);

		// delete node with value 4
		deleteByKey(list, 4);

		// print the LinkedList
		printList(list);

		// delete node with value 10
		deleteByKey(list, 10);

		// print the LinkedList
		printList(list);
	}

	private static LinkedList deleteByKey(LinkedList list, int key) {

		// store head node
		Node currNode = Application.head, previous = null;
		if (currNode != null && currNode.data == key) {
			Application.head = currNode.next; // changed head
			System.out.println(key + " found and deleted");
			return list;
		}

		while (currNode != null && currNode.data != key) {
			previous = currNode;
			currNode = currNode.next;
		}

		if (currNode != null) {
			previous.next = currNode.next;
			System.out.println(key + " found and deleted");
		}

		if (currNode == null) {
			System.out.println(key + " not found");
		}

		return list;
	}

	private static void printList(LinkedList list) {
		Node currNode = Application.head;
		System.out.print("Linked List   ");
		while (currNode != null) {
			System.out.print(currNode.data + " ");

			currNode = currNode.next;
		}
		System.out.println();
	}

	// method to insert new node
	private static LinkedList insert(LinkedList list, int data) {
		Node new_node = new Node(data);
		new_node.next = null;

		// if the Linked list is empty then make the new node as head
		if (Application.head == null) {
			Application.head = new_node;
		} else {
			// traverse till the last node and insert the new_node there
			Node last = Application.head;
			while (last.next != null) {
				last = last.next;
			}
			// insert the new_node at last node
			last.next = new_node;
		}
		return list;
	}

	static Node head; // head of list

	static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			next = null;
		}
	}

}
