package com.simplilearn.workshop;

import java.util.Stack;

public class ApplicationStack {

	public static void main(String[] args) {
		
		
		Stack<String> stack = new Stack<>();
		System.out.println(stack.pop() + " popped from stack");
		System.out.println(stack.isEmpty());
		stack.push("vinodh");
		stack.push("kumar");
		stack.push("mahendra");
		
		System.out.println(stack.isEmpty());
		
		System.out.println(stack.pop() + " popped from stack");
		
		
		
	}

}
