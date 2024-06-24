package questions;

public class B {
	public B() {
		System.out.println("Inside B constructor");
//		B b1 = new B();
		}
	public static void main(String[] args) {
		System.out.println("inside B");
		B b2 = new B();
		A zubin = new A();
	}

	
}