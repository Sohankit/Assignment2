package in.inueron;
//WAP to check  whether an array is a subset of another array.

import java.util.Arrays;

public class Demo6 {
	static boolean subArray(int[] a1, int[] a2, int l1, int l2) {
		for (int i = 0; i < l2; i++) {
			for (int j = 0; j < l1; j++) {
				if (a2[i] == a1[j])
					break;
				if(j==l2)
					return false;
			}
			
		}
		return true;
	}

	public static void main(String[] args) {
		int[] arr1 = { 9, 5, 7, 3, 6, 4, 8, 2, 1 };
		int[] arr2 = { 5, 2, 3, 4};

		Arrays.sort(arr1);
		Arrays.sort(arr2);
		int num1=arr1.length;
		int num2=arr2.length;
		if(subArray(arr1, arr2,num1 , num2)) {
			System.out.println("Array 2 is sub Array of Array 1");
		}
		else {
			System.out.println("Array 2 is not a sub Array.");
		}
	}
}
