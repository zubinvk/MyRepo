package programs;

public class Rotation {
	public static void main(String[] args) {
		boolean b = isRotation("zubin", "binzu");
		System.out.println(b);
	}
	
	
	public static boolean isRotation(String s1,String s2) {
		
		if(s1.length()==s2.length()) {
			if((s1+s1).contains(s2)){
				return true;
			}
		}
		return false;
		
	}

}


