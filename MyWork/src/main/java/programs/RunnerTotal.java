package programs;

import java.util.Arrays;

public class RunnerTotal {
	
	

	public static void main(String[] args) {
		
		int[] input={4,3,6,5,8,7,9,0,1,2,3};
		
		int[] runner = runnerTotal(input);
		
		
		System.out.println(Arrays.toString(runner));

	}


	public static int[] runnerTotal(int[] n) {
		int[] runner = new int[n.length];
		
		int init=0;
		for(int i=0;i<n.length;i++) {
			init = n[i]+init;
			runner[i]=init;
		}
		
		
		
		
		return runner;
	}
}
