package programs;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class FactorialNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		for(int i=0;i<=10;i++) {
//			
//			System.out.println(i+"-----"+factorial(i));
//		}
//		
//		int[] a1 = {1,2,3,4,5,6,7};
//		int[] a2 = {1,2,3,4,5,7,6};
//		System.out.println(Arrays.equals(a1, a2));

		
//		HashSet<String> hashSet = new HashSet<String>();
//		
//		HashMap<String,Integer> hm = new HashMap<String,Integer>();
//		
//		Integer num1 = hm.getOrDefault("Zubin", 2);
//		hm.put("Zubin", 5);
//		Integer num3 = hm.getOrDefault("Zubin", 100);
//		System.out.println(hm);
//		System.out.println(num3);
		
		System.out.println(0%2);
	}
	
	private static long factorial(int n) {
		if(n==1||n==0) {
			return (long)n;
		}
		return n*factorial(n-1);
	}

}
