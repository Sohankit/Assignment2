package in.inueron;

//WAP to sort an  array using Quick Sort Algorithm.
class Algorith {
	// Swap program.
	static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;

	}

	static int partition(int[] arr, int low, int high) {
		int pivot = arr[high];

		int i = (low - 1);

		for (int j = low; j <= high - 1; j++) {

			if (arr[j] < pivot) {

				i++;
				swap(arr, i, j);
			}
		}
		swap(arr, i + 1, high);
		return (i + 1);

	}

	static void quickSort(int[] arr, int low, int high) {

		if (low < high) {
			int pi = partition(arr, low, high);

			quickSort(arr, low, pi - 1);
			quickSort(arr, pi + 1, high);
		}
	}
}

public class Demo2 {

	public static void main(String[] args) {
		int[] arr = { 10, 9, 4, 5, 6, 7, 1, 3, 2 };
		int length = arr.length;
		Algorith.quickSort(arr, 0, length - 1);
		System.out.println("Sorted array: ");
		for (int i = 0; i < length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
