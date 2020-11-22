package com.simplilearn.workshop;

public class Applcation {

	public static void main(String[] args) {
		
		int[] arr = {12,3,5,7,4,19,26};
		int n = arr.length;
		int k = 4;
		
		KthSmallest instance = new KthSmallest();
		
		System.out.println("K'th smallest element is " + instance.findsmallestkthelement(arr, 0, n-1, k));

	}

}
