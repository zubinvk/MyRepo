package programs;

//Rotate String left or right

public class RotateString {

	public static void main(String[] args) {

//		String s = "toRotatethi sString";
		String s = "toRotatethisString";
		
		int NumberOfRotation = 7;
		int length = s.length();
				
		int n = NumberOfRotation%length;
		
		String leftPart = s.substring(length-n);
		String rightPart = s.substring(0, length-n);
		
		System.out.println(leftPart);
		System.out.println(rightPart);
		
		System.out.println(leftPart+rightPart);

	}

}
