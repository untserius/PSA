package p2;

public class M implements L {
	@Override
	public void test1() {
		System.out.println(150);
	}
	
	public static void main(String[] args) {
		M m1 = new M();
		m1.test1();
	}
}
