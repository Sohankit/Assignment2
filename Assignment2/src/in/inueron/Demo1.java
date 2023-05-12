package in.inueron;
//WAP to find the duplicates present in an array.

public class Demo1 {
		public static void main(String[] args) {
			
			//Initilazing array.
			int[] arr= {1,2,3,4,5,6,7,1,5,4};
			
			//Calculation length of the array.
			int length= arr.length;
			
			System.out.println("Duplicate present in an array are: ");
			
			//Looping to find duplicates.
			for(int i=0;i<length;i++) {
				for(int j=i+1;j<length;j++) {
					if(arr[i]==arr[j]) {
						System.out.print(arr[i]+" ");
					}
				}
			}
	}
}
