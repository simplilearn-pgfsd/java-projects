package com.simplilearn.workshop;

public class Application {

	public static void main(String[] args) {

		int[] x = { 1, 2, 3, 4, 5, 6, 7 };
		System.out.println("Before Calling Rotate:");
		for (int i = 0; i < x.length; i++) {
			System.out.print(x[i] + "   ");
		}
		
		new Application().rotate(x, 5);
		System.out.println("\nAfter Calling Rotate:");
		for (int i = 0; i < x.length; i++) {
			System.out.print(x[i] + "   ");
		}

	}

	private void rotate(int[] nums, int k) {
		if (k > nums.length) {
			k = k % nums.length;
		}

		int[] result = new int[nums.length];
		for (int i = 0; i < k; i++) {
			result[i] = nums[nums.length - k + i];
		}
		
		int j = 0;
		for (int i = k; i < nums.length; i++) {
			result[i] = nums[j];
			j++;
		}
		System.arraycopy(result, 0, nums, 0, nums.length);
	}

}
