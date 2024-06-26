package programs;

import java.util.HashMap;

import org.checkerframework.checker.units.qual.s;

public class AnagramChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(anagramChecker("listen","silent"));
		
		
	}

	
	public static boolean anagramChecker(String s1,  String s2) {
		
		
		char[] s1Array = s1.toCharArray();
		char[] s2Array = s2.toCharArray();
		
		HashMap<Character, Integer> hm1 = new HashMap<Character,Integer>();
		HashMap<Character, Integer> hm2 = new HashMap<Character,Integer>();
		
		hm1.getOrDefault("", 1);
		
		for(char c1:s1Array) {
			hm1.put(c1, hm1.getOrDefault(c1, 0)+1);
		}
		for(char c2:s2Array) {
			hm2.put(c2, hm2.getOrDefault(c2, 0)+1);
		}
		System.out.println(hm1);
		System.out.println(hm2);
		return hm1.equals(hm2);
	}
	
}



//import java.util.HashMap;
//import java.util.Map;
//
//public class AnagramChecker {
//    public static boolean areAnagrams(String str1, String str2) {
//        if (str1 == null || str2 == null || str1.length() != str2.length()) {
//            return false;
//        }
//
//        // Create character frequency maps for both strings
//        Map<Character, Integer> map1 = new HashMap<>();
//        Map<Character, Integer> map2 = new HashMap<>();
//
//        // Populate character frequency map for str1
//        for (char ch : str1.toCharArray()) {
//            map1.put(ch, map1.getOrDefault(ch, 0) + 1);
//        }
//
//        // Populate character frequency map for str2
//        for (char ch : str2.toCharArray()) {
//            map2.put(ch, map2.getOrDefault(ch, 0) + 1);
//        }
//
//        // Compare the two character frequency maps
//        return map1.equals(map2);
//    }
//
//    public static void main(String[] args) {
//        String str1 = "ZUBIN";
//        String str2 = "ZUBIN";
//
//        if (areAnagrams(str1, str2)) {
//            System.out.println(str1 + " and " + str2 + " are anagrams.");
//        } else {
//            System.out.println(str1 + " and " + str2 + " are not anagrams.");
//        }
//    }
//}
