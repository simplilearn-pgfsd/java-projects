package com.simplilearn.workshop;

import java.util.Arrays;

public class Application {

	public static void main(String[] args) {

		int[] array = { 6, 12, 18, 24, 32 };

		int length = array.length;

		int value = 18;

		int outcome = exponentialSearch(array, length, value);
		
		if (outcome < 0) {
			System.out.println("Element is not present in the array");
		}else {
			System.out.println("Element is present in the array at index :  " + outcome);
		}

	}

	private static int exponentialSearch(int[] array, int length, int value) {
		if (array[0] == value) {
			return 0;
		}
		int i = 1;
		
		while ( i < length && array[i]<=value) {
			i = i * 2;
		}
		
		return Arrays.binarySearch(array,i/2,Math.min(i, length),value);
	}

}
