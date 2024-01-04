package collections_practice;

import java.util.ArrayList;

public class B {
	public static void main(String[] args) {
		ArrayList<Integer> x = new ArrayList<Integer>();
		x.add(10); // Boxing
		x.add(20);
		x.add(new Integer(30)); //Boxing
		System.out.println("add method(): " + x);
		
		x.add(1, 500);
		System.out.println("add(index,value) method: " + x);
		
		ArrayList<Integer> y = new ArrayList<Integer>();
		y.add(300);
		y.add(510);
		System.out.println(y);
		
		x.addAll(2, y);
		System.out.println("addAll(index, collection) method: " + x);
		
		System.out.println(x.contains(500));
		System.out.println(x.contains(490));
		
		x.remove(0);
		System.out.println("remove method(): " + x);
	}
}
