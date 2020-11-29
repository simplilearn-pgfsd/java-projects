package com.simplilearn.workshop;

public class Application {

	private static final int MAX = 1000;

	public static void main(String[] args) {

		Application stack = new Application();

		stack.push(10);
		stack.push(20);
		stack.push(30);
		
		System.out.println(stack.pop() + " popped from stack");

	}

	private int pop() {
	
		if ( top < 0) {
			System.out.println("stack underflow");
			return 0;
		}else {
			int x = a[top--];
			return x;
		}
	}

	private int top;
	int a[] = new int[MAX];

	public Application() {
		top = -1;
	}

	private boolean push(int x) {

		if (top >= (MAX - 1)) {
			System.out.println("stack overflow");
			return false;
		} else {
			a[++top] = x;
			System.out.println(x + "pushed into stack");
			return false;
		}

	}

}
