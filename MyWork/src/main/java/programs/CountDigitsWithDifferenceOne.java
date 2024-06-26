package programs;

public class CountDigitsWithDifferenceOne {

	public static int countDigitsWithDifferenceOne(String str) {
	    if (str == null || str.length() <= 1) {
	        return 0; // There are not enough digits to make a comparison.
	    }

	    int count = 0;
	    for (int i = 1; i < str.length(); i++) {
//	        char currentChar = str.charAt(i);
//	        char prevChar = str.charAt(i - 1);

	        // Convert characters to integers
//	        int currentDigit = Character.getNumericValue(currentChar);
//	        int prevDigit = Character.getNumericValue(prevChar);
	        
	    	
	    	int currentDigit = str.charAt(i);
	    	int prevDigit = str.charAt(i - 1);
	        
	        System.out.println(currentDigit);
	        System.out.println(prevDigit);
	        System.out.println("===============");

	        if (currentDigit == prevDigit - 1) {
	            count++;
	        }
	    }

	    return count;
	}

	public static void main(String[] args) {
	    String input = "5655984";
	    int result = countDigitsWithDifferenceOne(input);
	    System.out.println("Result: " + result); // Output: Result: 2
	}

}
