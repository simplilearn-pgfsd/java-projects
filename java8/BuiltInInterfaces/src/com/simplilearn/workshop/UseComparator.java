package com.simplilearn.workshop;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class UseComparator {
	
	public static void main(String[] args) {
		
		List<String> names = new ArrayList<>();
		names.add("AAA");
		names.add("bbb");
		names.add("CCC");
		names.add("ddd");
		names.add("EEE");
		
		//simple case-sensitive sort operation
		Collections.sort(names);
		
		for(String element : names) {
			System.out.println(element);
		}
		
		//case insensitive sort with an lambda expression
		Comparator<String> comparator = (x,y) -> {
			return x.compareToIgnoreCase(y);
		};
		
		Collections.sort(names,comparator);
		System.out.println("case insensitive sort with an lambda expression");
		for(String element : names) {
			System.out.println(element);
		}
	}

}
