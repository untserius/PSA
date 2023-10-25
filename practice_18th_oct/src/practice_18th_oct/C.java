package practice_18th_oct;

public class C {
	public static void main(String[] args) {
		C c1 = new C();
		c1.test();
		C c2 = new C();
		c2.test();
		C c3 = new C();
		c3.test();
		c1.test();
		c2.test();
	}
	public void test() {
		System.out.println(this);
	}
}
