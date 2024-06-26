package programs;

public class Reversewords {

	public static void main(String[] args) {
		
		System.out.println(wordsReverse("Zubin Varkey kadavoor"));
		
	}
	
	
	
	
	public static String wordsReverse(String s) {
		String[] sArry = s.split(" ");
		int leftIndex =0;
		int rightindex=sArry.length-1;
		
		while(leftIndex<rightindex) {
			String temp = sArry[leftIndex];
			sArry[leftIndex]=sArry[rightindex];
			sArry[rightindex] = temp;
					
			leftIndex++;
			rightindex--;
		}
		
		return String.join(" ", sArry);
	}
	
}

