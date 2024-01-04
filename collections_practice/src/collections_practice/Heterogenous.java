package collections_practice;

import java.util.ArrayList;

public class Heterogenous {
	public static void main(String[] args) {
		ArrayList x = new ArrayList();
		x.add(10);
		x.add(20);
		x.add("String");
		x.add(12.4);
		x.add(true);
		x.add(new Character('a'));
		
		System.out.println(x);
		
	}
}
