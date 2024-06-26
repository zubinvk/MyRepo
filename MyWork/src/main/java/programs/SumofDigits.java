package programs;

public class SumofDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(digitnum(12345));

	}
	
	public static int digitnum(int num) {
		
		int sum=0;
		while (num>0) {
			
			sum= sum+num%10;
			num=num/10;
			
		}
		
		
		
		return sum;
	}

}
