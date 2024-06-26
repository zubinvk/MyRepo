package Samples;

public class Interview1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Test program to check vowel";
		if(isVowelsPresent(s)) {
			System.out.println("Vowels are Present");
			System.out.println(checkvowelsCount(s));
		}
		else {
			System.out.println("There are no Vowels");
		}

	}
	
	
	public static boolean isVowelsPresent(String inp) {
		String vowels = "aeiou";
		
		boolean isPrenst=false;
		for(char c : inp.toCharArray()) {
			if(vowels.contains(String.valueOf(c))) {
				isPrenst=true;
				break;
			}
		}
		
		return isPrenst;
	}
	
	public static int checkvowelsCount(String inp) {
		
		String vowels = "aeiou";
		
		
		int count = 0;
		for(char c : inp.toCharArray()) {
			if(vowels.contains(String.valueOf(c))) {
				count++;
			}
		}
		
		
		return count;
	}
	

	
	
}
