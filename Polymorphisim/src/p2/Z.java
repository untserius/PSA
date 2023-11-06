package p2;

public class Z implements Y {
	
	@Override
	public void test1() {
		System.out.println(1);
	}
	
	@Override
	public void test2() {
		System.out.println(2);
	}
	
	public static void main(String[] args) {
		Z z1 = new Z();
		z1.test1();
		z1.test2();
	}
}
