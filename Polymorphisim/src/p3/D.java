package p3;

public class D implements C {
	public static void main(String[] args) {
		D d1 = new D();
		d1.test1();
		d1.test2();
		d1.test3();
	}
	
	@Override
	public void test1() {
		System.out.println("Hello");
	}
}
