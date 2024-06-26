package programs;

public class SecondHighest {

	
	public static void main(String[] args) {
		 int[] arr = {5, 2, 8, 9, 1, 12, 4,20,21,22,15,100};
		 
		 System.out.println(secondHighest(arr));
	}

	
	public static int secondHighest(int[] arr) {
		
		if(arr.length<2) {
			throw new IllegalArgumentException("Array should have minimum 2 digits");
		}
		
		int highest=0;
		int secondHighest = 0;
		
		for(int n :arr) {
			if(n>highest) {
				secondHighest=highest;
				highest=n;
			}else if(n>secondHighest) {
				secondHighest=n;
			}
		}
		
		
		return secondHighest;
				
		
	}
}
