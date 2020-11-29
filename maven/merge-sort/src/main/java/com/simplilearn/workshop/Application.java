package com.simplilearn.workshop;

public class Application {

	public static void main(String[] args) {
		int[] array = { 12, 11, 13, 5, 6, 7 };

		System.out.print("given array : ");
		printArray(array);

		Application merge = new Application();
		merge.sort(array, 0, array.length - 1);
		System.out.print("\nsorted array : ");
		printArray(array);


	}

	private void sort(int[] array, int l, int r) {
		if (l < r) {

			int m = (l + r) / 2;

			sort(array, l, m);
			sort(array, m + 1, r);
			
			merge(array,l,m,r);
		}

	}

	private void merge(int[] array, int l, int m, int r) {
		int n1 = m - l +1;
		int n2 = r - m;
		
		int[] L = new int[n1];
		int[] R = new int[n2];
		
		for(int i = 0 ; i < n1 ; ++i) {
			L[i] = array[l + i];
		}
		for(int j = 0 ; j < n2 ; ++j) {
			R[j] = array[m + 1 + j];
		}
		
		int i = 0 , j = 0;
		int k = l;
		
		while ( i < n1 && j < n2) {
			if (L[i] <= R[j]) {
				array[k] = L[i];
				i++;
			}
			else {
				array[k] = R[j];
				j++;
			}
			k++;
		}
		
		while ( i < n1) {
			array[k] = L[i];
			i++;
			k++;
		}
		
		while (j < n2) {
			array[k] = R[j];
			j++;
			k++;
		}
		
	}

	private static void printArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + "  ");
		}
		System.out.println();
	}

}
