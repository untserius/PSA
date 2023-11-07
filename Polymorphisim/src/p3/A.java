package p3;

public interface A {
	default public void test1() {
		System.out.println("From Test1");
	}
	public void test2();
	
	default public void test3() {
		System.out.println("From Test3");
	}
}
