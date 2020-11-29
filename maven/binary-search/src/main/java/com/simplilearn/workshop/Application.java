package com.simplilearn.workshop;

public class Application {

	public static void main(String[] args) {
		int[] array = {3,6,9,12,15};
		
		int key = 12;
		
		int array_length = array.length;
		
		binarySearch(array,0,key,array_length);

	}

	private static void binarySearch(int[] array, int start, int key, int array_length) {

		int mid_value = (start + array_length) / 2;
		
		while (start <= array_length) {
			
			if (array[mid_value] < key) {
				start = mid_value += 1;
			}else if (array[mid_value] == key) {
				System.out.println("Element is found at index :" + mid_value);
				break;
			}else {
				array_length = mid_value - 1;
			}
			
			mid_value = (start + array_length)/2;
		}
		if (start > array_length) {
			System.out.println("Element is not found");
		}
	}

}
