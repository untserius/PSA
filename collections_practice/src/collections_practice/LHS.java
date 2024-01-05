package collections_practice;

import java.util.LinkedHashSet;

public class LHS {
	public static void main(String[] args) {
		LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
		lhs.add(10);
		lhs.add(20);
		lhs.add(30);
		lhs.add(40);
		lhs.add(50);
		
		System.out.println(lhs); // Insertion order is maintained 
	}
}
