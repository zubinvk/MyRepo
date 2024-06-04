package programs;

import java.util.Arrays;
import java.util.HashSet;

// Remove duplicates in an array

public class RemoveDuplicates {

	public static void main(String[] args) {
		int[] arr = {1,2,3,2,3,4,2,3,5,6};
		
		
//		int[] uniqueArray = removeDuplicate(arr);
		int[] uniqueArray = removeDuplicatesSet(arr);
		System.out.println(Arrays.toString(uniqueArray));
		

	}
	
	
	
//	Writing logic
	
	public static int[] removeDuplicate(int[] arr) {
		
		if(arr.length <=1) {
			return arr;
		}
		
		int newSize =1;
		
		for (int i = 1; i < arr.length; i++) {
			boolean isDuplicate = false;
				
			for(int j=0;j<newSize;j++) {
				if(arr[i]==arr[j]) {
					isDuplicate = true;
				}
				
			}

			if(!isDuplicate) {
				arr[newSize] = arr[i];
				newSize++;
			}
		}
		
//		Create New Array
		int[] uniqueArray =  new int[newSize];
		
		System.arraycopy(arr, 0, uniqueArray, 0, newSize);
		return uniqueArray;
		
	}
	
	
//	using Hashset
	
	public static int[] removeDuplicatesSet(int[] arr) {
		
		HashSet<Integer> hs = new HashSet<Integer>();
		
		for(int i:arr) {
			hs.add(i);
		}
		
		int size = hs.size();
		
		int[] unArray = new int[size];
		
		int index =0;
		for(Integer n: hs) {
			unArray[index] = n;
			index++;
		}
		return unArray;
		
	
	}

}
