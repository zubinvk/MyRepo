package programs;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(isPrime(29));
	}

	
	private static boolean isPrime(int num) {
		if(num<=1) {
			return false;
		}
		
		for(int i=2;i<=Math.sqrt(num);i++) {
			if( num%i==0){
				return false;
			}
		}
		
		return true;
	}
}
