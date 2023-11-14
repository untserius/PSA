package p1;

public class E extends D {
	
	@Override
	public void test1() {
		System.out.println(1);
	}
	
	public static void main(String[] args) {
		E e1 = new E();
		e1.test1();
		e1.test2();
	}
}
