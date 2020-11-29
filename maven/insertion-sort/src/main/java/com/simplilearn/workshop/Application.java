package com.simplilearn.workshop;

public class Application {

	public static void main(String[] args) {
		int[] array = { 9, 12, 3, 21, 44 };
		insertionSort(array);
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}

	}

	private static void insertionSort(int[] array) {
		int length = array.length;
		for (int j = 1; j < length; j++) {
			int key = array[j];
			int i = j - 1;
			while ((i > -1) && (array[i] > key)) {
				array[i + 1] = array[i];
				i--;
			}
			array[i+1] = key;
		}

	}

}
