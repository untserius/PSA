package collections_practice;

import java.util.ArrayList;

public class A {
	public static void main(String[] args) {
		ArrayList x = new ArrayList();
		x.add(10); // Boxing
		x.add(20);
		x.add(new Integer(30)); //Boxing
		
		System.out.println(x);
	}
}
