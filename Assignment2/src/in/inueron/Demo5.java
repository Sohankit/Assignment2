package in.inueron;

import java.util.Iterator;

//WAP to sort an array using Selection Sort Algorithm.
public class Demo5 {
	public static void main(String[] args) {
		int[] arr = { 1, 5, 4, 7, 6, 3, 8, 9 };
		SelectionSort s = new SelectionSort();
		s.selectionSort(arr);
		System.out.println("Sorted array using Selection Sort Algorithm: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
}

class SelectionSort {
	// Selection sort
	public void selectionSort(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			int small = i;

			for (int j = i + 1; j < arr.length; j++) {
				if (arr[small] > arr[j]) {
					small = j;
				}
			}
			int temp = arr[small];
			arr[small] = arr[i];
			arr[i] = temp;
		}
	}
}
