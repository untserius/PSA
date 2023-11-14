package p1;

public class L extends J implements K {
	
	@Override
	public void test2() {
		System.out.println("Hello User!");
	}
	
	public static void main(String[] args) {
		L l1 = new L();
		System.out.println(l1.x);
		l1.test2();
		
	}
}
