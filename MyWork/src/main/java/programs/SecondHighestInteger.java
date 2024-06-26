package programs;

import java.util.HashMap;
import java.util.Map.Entry;

public class SecondHighestInteger {

	public static void main(String[] args) {

		String s1= "The second highest value and its corresponding strinnnnnng";
		
		System.out.println(secondHighestCharacter(s1));
		
	}
	
	
	private static Entry<Character, Integer> secondHighestCharacter(String s) {
		
		HashMap<Character, Integer> hm = new HashMap<Character,Integer>();
		
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)!= ' ') {
				hm.put(s.charAt(i), hm.getOrDefault(s.charAt(i), 0)+1);
			}
		}
		
		Entry<Character, Integer> max = null;
		Entry<Character, Integer> secondMax=null;
		for( Entry<Character, Integer> entrySet: hm.entrySet()) {
			 if(max==null||entrySet.getValue()>max.getValue()) {
				 secondMax=max;
				 max=entrySet;
			 }else if(secondMax==null||secondMax.getValue()<entrySet.getValue()) {
				 secondMax=entrySet;
			 }
		}
		
		return secondMax;
	}

}
