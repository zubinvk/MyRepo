package programs;

//You are given a string s that contains some bracket pairs, with each pair containing a non-empty key.
//
//For example, in the string "(name)is(age)yearsold", there are two bracket pairs that contain the keys "name" and "age".
public class ValidParanthesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub'
		
		String a = "{()[{}]([{}]{})}";
		
//		System.out.println(a.replace("()", ""));
//		System.out.println(isValid(a));
		
		String message  = isValid(a)?"The brackets are balanced" : "the brackets are not balanced";
		
		System.out.println(message);
		
		

	}

	
	 public static boolean isValid(String s) {

		 boolean val=false;
	        while(true){
	        	int orglen = s.length();
	        	
	            s = s.replace("()", "");
	            s = s.replace("{}","");
	            s = s.replace("[]","");
	            
	            int modlength = s.length();
	            
	            if(s.length()==0) {
	            	val = true;
	            	break;
	            }
	            else if(modlength==orglen){
	            	break;
	            }
	            
	        }        	
	        return val;
	    }
}
