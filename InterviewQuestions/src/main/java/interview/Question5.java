package interview;

import java.util.HashMap;

// Find the unique and the number of occurances

//String testString = "The lazy blue river flows under the lazy blue sky";
//Output
//
//The - 2
//lazy - 2
//blue - 2
//river - 1
//flows - 1
//under - 1
//sky - 1



public class Question5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String testString = "The lazy blue river flows under the lazy blue sky";
		
		
		HashMap<String, Integer> hm = new HashMap<String,Integer>();
		
		for(String s: testString.split(" ")) {

			s = s.toLowerCase();
			hm.put(s, hm.getOrDefault(s, 0)+1);
		}
		
		System.out.println(hm);
		

	}

}
