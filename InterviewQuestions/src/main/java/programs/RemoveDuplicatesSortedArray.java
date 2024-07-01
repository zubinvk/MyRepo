package programs;

import java.util.Arrays;

public class RemoveDuplicatesSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = { 0, 2, 2, 3, 3, 3, 4, 5, 6, 6, 6 };
		int n = uniqueNums(nums);

		for (int i = 0; i < n; i++) {
			System.out.print(nums[i] + " ");
		}
	}

	public static int uniqueNums(int[] n) {

		int rd = 0;

		for (int i = 1; i < n.length; i++) {
			if (n[rd] != n[i]) {
				rd++;
				n[rd] = n[i];
			}
		}
		return rd + 1;
	}
}
