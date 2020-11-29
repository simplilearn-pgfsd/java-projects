package com.simplilearn.workshop;

import java.util.Arrays;

public class Application {

	public static void main(String[] args) {
		int[] array = {9,6,3,1,2,4,5};
		
		int length = array.length;
		
		selectionSort(array);
		
		System.out.println("the sorted elements are :");
		for (int element : array) {
			System.out.println(element);
		}
	}

	private static void selectionSort(int[] array) {
		for (int i = 0; i < array.length; i++) {
			int index = i;
			
			for (int j =i + 1; j < array.length; j++) {
				
				if (array[j] < array[index]) {
					index = j;
				}
			}
			
			int smallNumber = array[index];
			array[index] = array[i];
			array[i] = smallNumber;
			
			
		}
		
	}

}
