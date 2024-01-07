package collections_practice;

import java.util.Comparator;

public class D implements Comparator<Student>{
	@Override
	public int compare(Student o1, Student o2) {
		return o1.name.compareTo(o2.name);
	}
	
	public static void main(String[] args) {
		D d1 = new D();
		int val  = d1.compare(new Student (100, "abc"), new Student(200, "xyz"));
		System.out.println(val);
	}
}


