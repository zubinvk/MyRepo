package programs;

public class SwapNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a= 10,b=20;
		
		System.out.println("before Swapping = a = "+a +" b ="+b );
		
//		int c=a;
//		a=b;
//		b=c;
//		System.out.println("After Swapping = a = "+a +" b ="+b );
		
//		a = a+b;
//		b=a-b;
//		a=a-b;
//		System.out.println("After Swapping = a = "+a +" b ="+b );
		
//		a = a*b;
//		b=a/b;
//		a=a/b;
//		System.out.println("After Swapping = a = "+a +" b ="+b );
		
		
		b=a+b-(a=b);
		
		System.out.println("After Swapping = a = "+a +" b ="+b );
		
		
	}

}
