package programs;

public class Reversestring {
	
	public static void main(String[] args) {
		
		System.out.println(stringReverse("what is this"));
		//REmove special characters also
		
	}

	
	
	
	public static String stringReverse(String input) {
		
		int left=0;
		int right = input.length()-1;
		char[] charArray = input.toCharArray();
		
		while(left<right) {
			char temp = charArray[left];
			charArray[left] = charArray[right];
			charArray[right] = temp;
			left++;
			right--;
		}
		
		
		
		return new String(charArray);
	}
	
	
	
	
//	public static String stringReverse(String s) {
//		char[] sArry = s.toCharArray();
//		int leftIndex =0;
//		int rightindex=sArry.length-1;
//		
//		while(leftIndex<rightindex) {
//			char temp = sArry[leftIndex];
//			sArry[leftIndex]=sArry[rightindex];
//			sArry[rightindex] = temp;
//					
//			leftIndex++;
//			rightindex--;
//		}
//		System.out.println(sArry);
//		
//		
//		return new String(sArry);
//		
//		
//	}
}
