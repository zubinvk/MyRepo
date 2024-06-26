package programs;

public class OddEvenShifter {

	public static void shiftOddEven(int[] arr) {

		int left=0;
		int right=arr.length-1;
		
		while(left<right) {
			
			
			//Find the even from left(only for the odd we advance the left)
			while(left<right && arr[left]%2!=0) {
				left++;
			}
			
			//Find the odd number from the right(so that we can reduce from the right )
			
			while(left<right && arr[right]%2==0) {
				right--;
			}
			
			int temp = arr[left];
			arr[left]= arr[right];
			arr[right]=temp;
		}
//		return arr;
		
		
		
	}

	public static void main(String[] args) {
	    int[] arr = {4, 3, 6, 5, 8, 7, 9, 0, 1, 2, 3};
	    shiftOddEven(arr);
	    
	    // Print the modified array
	    for (int num : arr) {
	        System.out.print(num + " ");
	    }
	}

}
