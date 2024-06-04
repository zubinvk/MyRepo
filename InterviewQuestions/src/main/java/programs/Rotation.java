package programs;


//Find two string are rotation of each other 
//

public class Rotation {

	public static void main(String[] args) {
		
		System.out.println(isRotation("zubin", "inzub"));

	}
	
	public static boolean isRotation(String s1, String s2) {
		
		boolean res = false;
		
		if((s1+s1).contains(s2)){
			res = true;
			return res;
		}
		
		return res;
	}

}
