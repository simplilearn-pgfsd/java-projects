package com.simplilearn.workshop;

import com.simplilearn.interfaces.SimpleInterface;

public class UseSimpleInterfaceOld {

	public static void main(String[] args) {
		SimpleInterface instance = new SimpleInterface() {
			
			@Override
			public void doSomething() {
				System.out.println("say something");
				
			}
		};
		
		instance.doSomething();

	}

}
