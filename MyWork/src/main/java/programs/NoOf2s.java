package programs;

public class NoOf2s {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input = 25;
		
//		System.out.println(2/10);
		System.out.println(count2s(input));
	}
	
	public static int count2s(int inp) {
		
		int totalCountof2s=0;
		for(int i=1;i<=inp;i++) {

			int n =i;
//			if(n==2) {
//				System.out.println(n);
//				totalCountof2s++;
//			}
			
			while(n!=0) {
				if(n%10==2) {
					totalCountof2s++;
				}
				n=n/10;
			}
		}
		
		
		
		return totalCountof2s;
	}

}
