package com.simplilearn.workshop;

public class Application {
	
	private final String message = "Hello World!";

	public static void main(String[] args) {
		System.out.println(new Application().getMessage());

	}
	private final String getMessage() {
		return message;
	}

}
