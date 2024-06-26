package com.selenium;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stuby
		
		try {
			
			Float f1 = new Float("3.0");
			int x = f1.intValue();
			byte b = f1.byteValue();
			double d = f1.doubleValue();
			System.out.println(x+b+d);
			System.out.println(b);
			
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
