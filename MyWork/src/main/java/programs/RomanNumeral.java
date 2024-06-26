package programs;

import java.util.HashMap;

public class RomanNumeral {
	public static void main(String[] args) {
//		romanConvert("MCDXCII");
		romanConvert("XII");
		
	}

	
	static int romanConvert(String s) {
        HashMap<Character, Integer> romanValues = new HashMap<>();
        romanValues.put('I', 1);
        romanValues.put('V', 5);
        romanValues.put('X', 10);
        romanValues.put('L', 50);
        romanValues.put('C', 100);
        romanValues.put('D', 500);
        romanValues.put('M', 1000);
        
        
        //MCDXCII
        int result = 0;
        int prevValue = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            char currentChar = s.charAt(i);
            int currentValue = romanValues.get(currentChar);

            // If the current value is less than the previous value,
            // subtract it; otherwise, add it to the result.
            if (currentValue < prevValue) {
                result -= currentValue;
            } else {
                result += currentValue;
            }

            prevValue = currentValue;
        }

        System.out.println(result);
        return result;
        		
	}
}
