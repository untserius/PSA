package practice_18th_oct;

public class B {
	public static void main(String[] args) {
		System.out.println(this); // error
	}
	
	public static void test() {
		System.out.println(this);
	}
}
