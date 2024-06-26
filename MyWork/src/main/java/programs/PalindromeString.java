package programs;

public class PalindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "malayalam";
		
		
		
		if(isPalindrome(input)) {
			System.out.println("String is Palindrome");
		}else {
			System.out.println("The String is not Palindrome");
		}
		

	}
	
	public static boolean isPalindrome(String s) {
		
		for(int i=0;i<s.length()/2;i++) {
			if(s.charAt(i)!=s.charAt(s.length()-i-1)) {
				return false;
			}
			
		}
		
		
		return true;
		
	}

}
