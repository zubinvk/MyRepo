package programs;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 115646056;
		
		int rev = 0;
		while(num!=0) {
			rev= rev*10+num%10;
			num/=10;
		}
		
		System.out.println(rev);
	}

}
