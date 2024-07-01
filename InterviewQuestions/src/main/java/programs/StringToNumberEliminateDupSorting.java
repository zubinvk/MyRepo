package programs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class StringToNumberEliminateDupSorting {

	public static void main(String[] args) {

		String n = "7 56 3 21 23 45 65 53 47 3 4 53 45 1 56 34 57";
		HashSet<Integer> hs = new HashSet<Integer>();
//		for(char c: n.toCharArray()) {
//			System.out.println(c);
//			if(Character.isDigit(c)) {
//				hs.add(Integer.parseInt(String.valueOf(c)));
//			}
//	}
		
		
		for(String s : n.split(" ")) {
			hs.add(Integer.parseInt(s));
		}

//		System.out.println(hs);
//		ArrayList<Integer> arrayList = new ArrayList<>(hs);
//		Collections.sort(arrayList);
//		
//		System.out.println(arrayList.toString());
	}
	
	
	public static int[] removeDuplicates(int[] arr) {
		int length = arr.length;
		if(length<2) {
			return arr;
		}
		
		for(int i=0;i<length;i++) {
			
			for(int j=i+1;j<length;j++) {
				if[arr[i]==arr[j]] {
					
				}
			}
		}
		
		return arr;
		
		
	}
	
	public static void sortSet(int[] nums) {
		int length = nums.length;
		
		for(int i=0;i<length;i++) {
			
			for(int j=1;j<length-i;j++) {
				if(nums[j]>nums[j-1]) {
					int temp =nums[j];
					nums[j] = nums[j-1];
					nums[j-1]=temp;
				}
			}
		}
		
	}
}
