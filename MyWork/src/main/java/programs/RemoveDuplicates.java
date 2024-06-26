package programs;

import java.util.Arrays;

public class RemoveDuplicates {
    public static int[] removeDuplicatesInPlace(int[] arr) {
        if (arr.length <= 1) {
            return arr; // No duplicates to remove
        }
        
        int newSize = 1;
        
        for (int i = 1; i < arr.length; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < newSize; j++) {
                if (arr[i] == arr[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            
            if (!isDuplicate) {
                arr[newSize] = arr[i];
                newSize++;
            }
        }
        
        // Create a new array with the correct size
        int[] uniqueArray = new int[newSize];
        System.arraycopy(arr, 0, uniqueArray, 0, newSize);
        
        return uniqueArray;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 4, 5};
        int[] uniqueArr = removeDuplicatesInPlace(arr);
        System.out.println(Arrays.toString(uniqueArr));
    }
}
