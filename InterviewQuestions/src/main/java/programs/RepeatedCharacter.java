package programs;
//Count occurrences of a character 'a' in a repeated string

public class RepeatedCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	    String str = "a";
	    
//	    System.out.println(str);
	    System.out.println(repeatedString(str, 1000000000));
	}
	
	
	public static long repeatedString(String s, long n) {
	    // Write your code here
		int repeatNumber = (int) n/s.length() + 1;
		StringBuilder sb= new StringBuilder();
		for(int i=0;i<repeatNumber;i++) {
			sb.append(s);
		}
		System.out.println(sb);

		long count =0;
		for(int i=0;i<n;i++) {
			if(sb.charAt(i)=='a') {
				count++;
			}
		}
		
		return count;
		
	    }	

}
