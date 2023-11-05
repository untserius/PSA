package p1;

public class Y implements X {
		
	public void test() {
		System.out.println("test");
	}
		
	public void example() {
		System.out.println("example");
	}
		
	public static void main(String[] args) {
		Y y1 = new Y();
		y1.test();
		y1.example();
	}
}
