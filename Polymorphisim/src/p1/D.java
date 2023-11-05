package p1;

public class D extends C{
	public void test2() {
		System.out.println(500);
	}
	public static void main(String[] args) {
		D d1 = new D();
		d1.test1();
		d1.test2(); //value changed
	}
}
