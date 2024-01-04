package collections_practice;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class C {
	public static void main(String[] args) {
		List<Integer> x = new LinkedList<Integer>();
		x.add(10); // Boxing
		x.add(20);
		x.add(new Integer(30)); //Boxing
		System.out.println("add method(): " + x);
		
		x.add(1, 500);
		System.out.println("add(index,value) method: " + x);
		
		List<Integer> y = new LinkedList<Integer>();
		y.add(300);
		y.add(510);
		System.out.println(y);
		
		x.addAll(2, y);
		System.out.println("addAll(index, collection) method: " + x);
		
		System.out.println(x.contains(500));
		System.out.println(x.contains(490));
			
		//addFirst() & addLast() methods
		
		LinkedList<Integer> z = new LinkedList<Integer>();
		
		z.add(10);
		z.add(20);
		z.add(30);
		z.add(40);
		z.addFirst(50);
		z.addFirst(60);
		z.addLast(70);
		z.addLast(80);
		
		System.out.println(z);

	}
}
