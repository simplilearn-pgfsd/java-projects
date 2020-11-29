package com.simplilearn.workshop;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		
		int[] array = {10,20,30,40,50};
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter the element to be searched : ");
		
		int searchValue = keyboard.nextInt();
		
		int result = linearSearch(array,searchValue);
		
		if (result == -1) {
			System.out.println("element not in the array");
		}else {
			System.out.println("element found at " + result + " and the search key is " + array[result]);
		}

	}

	private static int linearSearch(int[] array, int searchValue) {
		int  array_length = array.length;
		
		for (int i = 0; i < array_length - 1; i++) {
			
			if (array[i] == searchValue) {
				return i;
			}
		}
		return -1;
	}

}
