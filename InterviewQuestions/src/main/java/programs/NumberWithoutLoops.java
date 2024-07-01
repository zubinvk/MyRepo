package programs;

public class NumberWithoutLoops {
	// Print 1 to 10 without using loops

	public static void main(String[] args) {

		printNumbers(1,100);
		
	}

	
	public static void printNumbers(int start, int stop) {
		
		if(start <= stop) {
			System.out.print(start + " ");
			
			printNumbers(start+1 ,stop);
		}
	}
}
