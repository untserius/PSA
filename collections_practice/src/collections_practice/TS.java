package collections_practice;

import java.util.TreeSet;

public class TS {
	public static void main(String[] args) {
		TreeSet<Integer> ts = new TreeSet<>();
		ts.add(20);
		ts.add(21);
		ts.add(23);
		ts.add(7);
		ts.add(200);
		
		System.out.println(ts);// sorted output
	}
}
