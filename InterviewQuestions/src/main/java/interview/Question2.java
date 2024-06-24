package interview;

public class Question2 {
	
	public static void main(String[] args) {
	    String a = "abc";
	    String b = "abc";
	    String c = new String("abc");

	    if (a == c && a.equals(b)) {
	        System.out.println("Condition met");
	    } else {
	        System.out.println("Condition not met");
	    }
	}

}
