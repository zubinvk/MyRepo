package programs;

public class A {
	
	public static void main(String[] args) {
		
		System.out.println("Inside Main");
		A a1 = new A();	
		B b2 = new B();
//		B a2 = new A();	
	}
	public A() {
		System.out.println("A Constructor");
	}

}
