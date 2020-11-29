package com.simplilearn.workshop;

public class Application {

	public static void main(String[] args) {

		int[] array = { 25, 20, 15, 5, 10 };

		bubbleSort(array);
		
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}

	}

	private static void bubbleSort(int[] array) {
		int length = array.length;
		
		int temp;
		
		for (int i = 0; i < length; i++) {
			for (int j = 1; j < array.length; j++) {
				if (array[j-1] > array[j]) {
					temp = array[j-1];
					array[j-1] = array[j];
					array[j] = temp;
				}
			}
		}
	}

}
