package collections_practice;

import java.util.HashSet;

public class HS {
	public static void main(String[] args) {
		HashSet<Integer> hasSet = new HashSet<Integer>();
		hasSet.add(10);
		hasSet.add(20);
		hasSet.add(30);
		hasSet.add(40);
		hasSet.add(50);
		
		System.out.println(hasSet); // No insertion order
	}
}
