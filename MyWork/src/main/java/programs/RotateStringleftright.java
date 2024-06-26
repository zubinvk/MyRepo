package programs;

public class RotateStringleftright {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input ="zubin";
		int n = (7%5);
		String leftPart = input.substring(input.length()-n);
        String rightPart = input.substring(0,input.length()-n);
        
        System.out.println(leftPart);
        
        System.out.println(rightPart);
//
//        
        System.out.println(leftPart+rightPart);
	}

}
