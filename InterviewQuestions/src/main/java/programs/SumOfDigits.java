package programs;

//Program to find the sum of the digits of the given number

public class SumOfDigits {

	public static void main(String[] args) {

		int n = 36345125;
		
		System.out.println(digitSum(n));
		
	}

	public static int digitSum(int n) {
		
		int sum=0;
		while(n>0) {
			sum = sum+n%10; 
			n=n/10;
		}
		
		return sum;
	}
}
