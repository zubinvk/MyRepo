package programs;

public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int org_num = 1231;
		int num = org_num;
		int rev = 0;
		
		while(num!=0) {
			rev = rev*10+num%10;
			num/=10;
		}
		System.out.println(rev);
		
		if(org_num==rev) {
			System.out.println("The number is palindrome");
		}else {
			System.out.println("The number is not  palindrome");
		}

	}

}
