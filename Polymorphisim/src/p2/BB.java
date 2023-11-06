package p2;

public class BB implements AA {
	
	@Override
	public void test() {
		System.out.println("test");
	}
	
	@Override
	public void trial() {
		System.out.println("trial");
	}
	
	public static void main(String[] args) {
		BB b1 = new BB();
		b1.test();
		b1.trial();
	}
}
