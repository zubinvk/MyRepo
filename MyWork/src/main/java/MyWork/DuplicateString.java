package MyWork;

import java.util.HashMap;

public class DuplicateString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String s = "javaj2ee";
		
		System.out.println(findStringCount(s));
		

	}

	
	
	public static HashMap<Character, Integer> findStringCount(String s) {
		
		char[] sArray = s.toCharArray();
		int n = sArray.length;
		
		HashMap<Character, Integer> hm = new HashMap<Character,Integer>();
		
		for(int i=0;i<n;i++) {
			
			hm.put(sArray[i], hm.getOrDefault(sArray[i], 0)+1);
			
			
		}
		
		return hm;
	}
}
