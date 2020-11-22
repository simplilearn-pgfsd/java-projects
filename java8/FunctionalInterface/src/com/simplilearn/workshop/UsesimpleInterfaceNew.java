package com.simplilearn.workshop;

import com.simplilearn.interfaces.SimpleInterface;

public class UsesimpleInterfaceNew {

	public static void main(String[] args) {
		SimpleInterface instance = () -> System.out.println("say something via lambda");
		instance.doSomething();
		

	}

}
