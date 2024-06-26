package programs;


public class B extends A{
	public static void main(String[] args) {
		System.out.println("inside B");
		B b1 = new B();
	}

	public B() {
		System.out.println("b constuctor");
	}
	
}