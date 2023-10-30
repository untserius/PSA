package p2;

import p1.D;

public class B extends D {
	public void anything2() {
		System.out.println(768);
	}
	
	public static void main(String[] args) {
		B b1 = new B();
		b1.anything2();
		b1.anything();
	}
}
