package programs;


// count the number of vowels and shift the lowercase and upper case to left and right

public class CountVowelsAndShift {

	public static void main(String[] args) {
		
		String is = "Hello AsdfubaWorld";
		
		System.out.println(countVowels(is));
		System.out.println(shiftChar(is));

	}
	
	public static int countVowels(String input) {
		
		String vowels = "aeiouAEIOU";
		
		char[] ip = input.toCharArray();
		int count=0;
		for(char c: ip) {
			if (vowels.contains(String.valueOf(c))){
				count++;
			}
		}
		
		return count;
	}
	
	public static String shiftChar(String input) {
		
		char[] ip = input.toCharArray();
		
		int left =0;
		int right = ip.length-1;
		
		
		while(left<right) {
			
			while(left<right && Character.isLowerCase(ip[left])==true) {
				left++;
			}
			
			while(left<right && Character.isUpperCase(ip[right])==true) {
				right--;
			}
			
			char temp = ip[left];
			ip[left] = ip[right];
			ip[right] =temp;
			
		}
		String op = new String(ip);
		
		return op;
	}
	

}
