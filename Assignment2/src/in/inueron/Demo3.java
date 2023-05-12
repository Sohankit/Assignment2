package in.inueron;
//WAP to sort an array using Bubble Sort Algorithm

class Algorithm1{
	void bubbleSort(int[] arr) {
		
		int n= arr.length;
		
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<n-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	}
}

public class Demo3 {
	public static void main(String[] args) {
		Algorithm1 a= new Algorithm1();
		int[] arr= {10,5,2,4,6,7};
		a.bubbleSort(arr);
		
		System.out.println("Sorted array is: ");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
