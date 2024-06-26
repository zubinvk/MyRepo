package programs;

public class Vowelsandshift {

	public static void main(String[] args) {
		String inputString = "HellO aruiWorld";
		System.out.println(countVowels(inputString));

		System.out.println(inputString);
		System.out.println(shiftChar(inputString));
		
//		System.out.println(shiftusingBulder(inputString));
//		;
	}

	public static int countVowels(String inputString) {

		String vowels = "aeiouAEIOU";
		int a = vowels.toCharArray().length;

		int count = 0;
		for (int i = 0; i < inputString.length(); i++) {
			if (vowels.contains(String.valueOf(inputString.charAt(i)))) {
				count++;
			}

		}
		return count;
	}

	public static String shiftChar(String s) {

//		char[] cA = s.toCharArray();
//
//		int left = 0;
//		int right = s.length()-1;
//
//		while (left < right) {
//
//			while (left < right && Character.isUpperCase(cA[left]) == true) {
//				left++;
//			}
//
//			while (left < right && Character.isUpperCase(cA[right]) == false) {
//
//				right--;
//			}
//
//			char temp = cA[left];
//			cA[left] = cA[right];
//			cA[right] = temp;
//
//		}
//
//		return new String(cA);

		
		char[] sarray = s.toCharArray();
		
		int left=0;
		int right=sarray.length-1;
		
		
		while(left<right) {
		
		while(left<right && Character.isLowerCase(sarray[left])==true) {
			left++;
		}
		
		while(left <right && Character.isUpperCase(sarray[right])==true) {
			right--;
		}
		char temp = sarray[left];
		sarray[left]=sarray[right];
		sarray[right]=temp;
				
		}
		
		return new String(sarray);
	}
	
	public static String shiftusingBulder(String str) {
		
			
	        StringBuilder upperCaseChars = new StringBuilder();
	        StringBuilder lowerCaseChars = new StringBuilder();

	        for (int i = 0; i < str.length(); i++) {
	            char ch = str.charAt(i);
	            if (Character.isUpperCase(ch)) {
	                upperCaseChars.append(ch);
	            } else {
	                lowerCaseChars.append(ch);
	            }
	        }

	        return upperCaseChars.toString() + lowerCaseChars.toString();
	    }

	
}
	

