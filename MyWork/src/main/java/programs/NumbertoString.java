package programs;

public class NumbertoString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(convertNumberToWords(16));

	}

	public static String convertNumberToWords(int n) {

		String[] ones = { "", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine" };
		String[] teens = { "Ten", "Eleven", "Twelve", "Thirteen", "Forteen", "Fifteen", "Sixteen", "Seventeen",
				"Eighteen", "Nineteen" };
		String[] tens = { "", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninty" };

		if (n == 0) {
			return "Zero";
		}
		if (n < 10) {
			return ones[n];
		} else if (n < 20) {
			int num = n % 10;
			return teens[num];
		} else if (n < 100) {
			int tenth = n / 10;
			int remaining = n % 10;
			if (remaining == 0) {
				return tens[tenth];
			} else {

				return tens[tenth] + " " + convertNumberToWords(remaining);
			}
		}else if (n<1000) {
			int hundredth = n/100;
			int remaining = n%100;
			
			if(remaining ==0) {
				return ones[hundredth] + " Hundred";
			}else {
				return ones[hundredth] + " Hundred " + convertNumberToWords(remaining);
			}
		}
		else if (n<1000000) {
			int thousands = n/1000;
			int remaining = n%1000;
			
			if(remaining ==0) {
				return convertNumberToWords(thousands)+ " Thousand";
			}else {
				return convertNumberToWords(thousands)+" Thousand "  + convertNumberToWords(remaining);
			}
		}

		return "";
	}

}
