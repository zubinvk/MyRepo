package programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map.Entry;

public class CharacterCount {
	
	public static void main(String[] args) {
		
		charCount("ZubinzububiVkadavoor");
		
		
//		String arr[]= new String[3];
//
//		int[] arr1 = {1,2,2,3,4,6};
//		
		
	
	}

	
	
//	public static String removeCharfromFirst(String first, String second) {
//		if(first ==null || second ==null) {
//			return first;
//		}
//		
//		List<char[]> fList = Arrays.asList(first.toCharArray());
//		List<char[]> sList = Arrays.asList(first.toCharArray());
//		for(int i=0; i<fList.size();i++) {
//			if(sList.contains(fList.get(i))) {
//				fList.remove(fList.get(i));
//			}
//		}
//	
//		
//	}
	
	public static void charCount(String input) {
		
		char[] charArray = input.toCharArray();
		
		HashMap<Character, Integer> hm = new HashMap<Character,Integer>();
		
		for(char c:charArray) {
			hm.put(c, hm.getOrDefault(c, 0)+1);
		}
		
		System.out.println(hm);
		
		int maxCount=0;
		char maxChar = 0;
		
		
		for(Entry<Character, Integer> e:hm.entrySet()) {
			if(e.getValue()>maxCount) {
				maxCount = e.getValue();
				maxChar = (char)e.getKey();
			}
		}
		System.out.println(maxChar +" is repeated more times - "+maxCount);	
	}
}
