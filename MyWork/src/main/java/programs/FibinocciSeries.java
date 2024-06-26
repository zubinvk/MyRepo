	5package programs;

public class FibinocciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(fibinocci(11));

	}

	
	public static int fibinocci(int n) {
		
		if(n==0||n==1) {
			return n;
		}
		
			return fibinocci(n-1)+fibinocci(n-2);
		
	}
}
