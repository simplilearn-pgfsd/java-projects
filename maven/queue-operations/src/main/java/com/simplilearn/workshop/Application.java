package com.simplilearn.workshop;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class Application {

	public static void main(String[] args) {
		
		Deque<String> names = new ArrayDeque<>();
		names.add("vinodh");
		names.add("clarence");
		names.add("dennis");
		names.addFirst("samarth");
		
		for (String element : names) {
			System.out.println(element);
		}
		Queue<String> locationsQueue = new LinkedList<>();
		locationsQueue.add("bengalore");
		locationsQueue.add("Patna");
		locationsQueue.add("gurgaon");
		locationsQueue.add("noida");
		
		System.out.println("Queue is  : " + locationsQueue);
		
		System.out.println("Head Of Queue : " +locationsQueue.peek());
		
		locationsQueue.remove();
		
		System.out.println("After removing head of queue : " +locationsQueue);
		System.out.println("Size of Queue : " + locationsQueue.size());
	}

}
