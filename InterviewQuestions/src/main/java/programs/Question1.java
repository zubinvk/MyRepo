package questions;

//Sample Input: This@ is an interview$
//Sample Output: sihT si na weivretni

public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String sample = "This@ is an interview$";
		
		System.out.println(reverse(sample));

	}

	
	public static StringBuilder reverse(String ip) {
		
		String[] sa = ip.split(" ");
		
		StringBuilder sb = new StringBuilder();
		for(String i: sa) {
			sb.append(stringreversal(i)+" ");
		}
		
		
		return sb;
	}
	
	public static String stringreversal(String s) {
		String specChar ="!@#$%^&*()?|}{";
		
		char[] sa1 = s.toCharArray();
		char[] sa = new char[sa1.length];
		int count =0;
		for(char c:sa1) {
			if(!specChar.contains(String.valueOf(c))){
				sa[count]=c;
				count++;
			}
		}
		
		
		
		
		int len = sa.length;
		
		
		int left =0;
		int right = len-1;
		
		
		while(left<right) {
	
			char temp = sa[left];
			sa[left] = sa[right];
			sa[right] = temp;
			
			left++;
			right--;
		}
		
		return new String(sa);
	}
}
