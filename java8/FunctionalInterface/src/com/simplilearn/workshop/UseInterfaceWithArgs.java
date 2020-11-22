package com.simplilearn.workshop;

import com.simplilearn.interfaces.InterfaceWithArgs;

public class UseInterfaceWithArgs {

	public static void main(String[] args) {
		InterfaceWithArgs instance = ( a, b)->{
			int result = a + b;
			System.out.println("The result is " +result);
		};
		
		instance.calculate(10, 5);
	}

}
