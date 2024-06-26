package programs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class A_Test {

	public static void main(String[] args) {

		double a = 10;

//		to print 6 decimal places without new line
		System.out.printf("%.6f", a);
		
//		System.out.printf("\n%.10f",23);

//		to print 5 decimal places with new line beginning and the end

		System.out.printf("\n%.5f\n", a);

		System.out.println("Zubin");
		
		List<Integer> lst = new ArrayList<>();
		lst.add(-1);
		lst.add(-2);
		lst.add(-1);
		lst.add(0);
		lst.add(0);
		lst.add(5);
		lst.add(7);
		lst.add(8);
		lst.add(9);
		
		System.out.println(lst);
		Collections.sort(lst);
		
		System.out.println(lst);
		plusMinus(lst);

	}

	public static void plusMinus(List<Integer> arr) {
		// Write your code here
		int countp = 0;
		int countn = 0;
		int count0 = 0;

		for (Integer i : arr) {
			if (i < 0) {
				countn++;
			} else if (i == 0) {
				count0++;
			} else {
				countp++;
			}
		}

		double pRatio = countp / (double)arr.size();
		double nRatio = countn / (double)arr.size();
		double zRatio = count0 / (double)arr.size();
		System.out.printf("%.6f\n", pRatio);
		System.out.printf("%.6f\n", nRatio);
		System.out.printf("%.6f\n", zRatio);

	}

}
