package programs;

import java.util.Arrays;
import java.util.Collections;

public class ArrayToInt {

    public static void main(String[] args) {
        int[] numbers = {25, 84, 16};
        int result = concatenateIntArray(numbers);
        System.out.println(result);
    }

    public static int concatenateIntArray(int[] arr) {
        // Check if the array is not null and not empty
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Input array must not be null or empty");
        }

        // Initialize result as 0
        int result = 0;

        // Iterate over the array and concatenate each integer to the result
        for (int num : arr) {
            int tempResult = result;
            int numDigits = 1;

            // Calculate the number of digits in the current number
            while (num / numDigits > 0) {
                numDigits *= 10;
            }

            // Update the result by multiplying it by the appropriate power of 10 and adding the current number
            result = result * numDigits + num;
        }

        return result;
    }
}
