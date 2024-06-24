package interview;

//
//String word = "a123bc34d8ef34";
//O/P: 3
// 
//Write a code to get the count of unique  numbers. 
//Explanation: There are numbers 123, 34, 8, 34 but only 123, 8, 34 are unique so output should be 3



//import java.util.HashMap;
import java.util.HashSet;

public class Question1 {
	
	public static void main(String[] args) {
		String word = "a123bc34d8ef34";
		
		String res = word.replaceAll("([a-zA-Z])"," ");
		System.out.println(res);
		
		HashSet<String> hm = new HashSet<String>();
		
		for(String s:res.split(" ")) {
//			System.out.println(s);
			if(!s.isEmpty()) {
			hm.add(s);
			}
			
		}
		
		System.out.println(hm.size());
		
		
	}

	
	public static void findUnique(String S) {
		
		
	}
	
	
}
