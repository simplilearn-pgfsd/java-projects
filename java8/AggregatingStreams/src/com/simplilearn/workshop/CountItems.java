package com.simplilearn.workshop;

import java.util.ArrayList;
import java.util.List;

public class CountItems {

	public static void main(String[] args) {
		List<String> strings = new ArrayList<String>();
		for(int i = 0 ; i < 1000000 ; i++) {
			strings.add("Item " + i);
		}
		
		long count = strings.stream().parallel().count();
		System.out.println("Count : " +count);

	}

}
