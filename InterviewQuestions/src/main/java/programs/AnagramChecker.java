package programs;

import java.util.HashMap;

//Check the given 2 strings are anagrams

public class AnagramChecker {

	public static void main(String[] args) {

//		isAnagram("silent","silent");
		System.out.println(isAnagram("Astronomer","Moonstarer"));
	}

	private static boolean isAnagram(String s1, String s2) {
		
		
		HashMap<Character, Integer> hm1 = new HashMap<Character,Integer>();
		HashMap<Character, Integer> hm2 = new HashMap<Character,Integer>();
		
		for(char a: s1.toCharArray()) {
			
			hm1.put(a, hm1.getOrDefault(a, 0)+1);
		}
		for(char b: s2.toCharArray()) {
			hm2.put(b, hm2.getOrDefault(b, 0)+1);
		}
		System.out.println(hm1);
		System.out.println(hm2);
		return hm1.equals(hm2);
	}

}
