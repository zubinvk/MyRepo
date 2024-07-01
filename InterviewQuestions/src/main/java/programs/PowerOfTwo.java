package programs;

public class PowerOfTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub4
		
		System.out.println(poweroftwo(128));
		

	}
	
	static boolean poweroftwo(int n) {
		
		if(n==0) {
			return false;
		}
		
		if((n&(n-1))==0) {
		
		return true;
	}
		return false;

}}
