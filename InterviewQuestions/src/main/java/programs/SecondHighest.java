package programs;

import java.util.HashMap;
import java.util.Map.Entry;

// For the given string find the second highest repeating char and the count

public class SecondHighest {

	public static void main(String[] args) {

		
		String s = " The seeeeeeeeeecond hiiiiiiighest of this string we have to find";
		System.err.println(secHigh(s));
		
	}

	
	public static Entry<Character, Integer> secHigh(String s) {
		
		
		HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
		
		for(char c: s.toCharArray()) {
			if(c!=' ') {
				
				hm.put(c, hm.getOrDefault(c, 0)+1);
			}
		}
		System.out.println(hm);
		
		int highest =0;
		int secondHighest = 0;
		Entry<Character, Integer> highestChar=null;
		Entry<Character, Integer> secondhighestChar = null;
		
				
		
		for(Entry<Character, Integer> e:hm.entrySet()) {
			if(e.getValue()>highest) {
				secondHighest = highest;
				secondhighestChar = highestChar;
				highest = e.getValue();
				highestChar= e;
			}
			else if(e.getValue()> secondHighest) {
				secondHighest= e.getValue();
				secondhighestChar = e;
			}
			
		}

		return secondhighestChar;
	}
	
}
