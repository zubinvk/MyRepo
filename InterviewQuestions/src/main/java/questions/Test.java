package questions;

public class Test {
	
	public static void main(String[] args) {
		new Test();
	}

	
	public Test() {
		
		Bar b = new Bar();
		Bar b1 = new Bar();
		
		update(b);
		update(b1);
		b1=b;
		update(b);
		update(b1);
		
	}
	
	public void update(Bar bar) {
		bar.x =20;
		System.out.println(bar.x);
	}
}
