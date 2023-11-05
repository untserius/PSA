package p1;

public class B extends A{
	public void test() {
		System.out.println(100000);// value changed
	}
	public static void main(String[] args) {
		B b1 = new B();
		b1.test();
	}
}
