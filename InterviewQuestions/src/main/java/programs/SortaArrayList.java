package programs;

import java.util.Arrays;

// Sort a given int array

public class SortaArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		int[] arr = {1,3,5,67,12,12,34,12,45,21};
		
		System.out.println(Arrays.toString(sortArray(arr)));
		
		
		
	}
	
	public static int[] sortArray(int[] arr) {
		
		for(int i=1;i<arr.length;i++) {
			if(arr[i]<arr[i-1]) {
				int temp = arr[i];
				arr[i] = arr[i-1];
				arr[i-1]= temp;
			}
		}
		return arr;
	}

}
