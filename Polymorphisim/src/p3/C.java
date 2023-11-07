package p3;

@FunctionalInterface
public interface C {
	
	public void test1();
	
	default public void test2() {
		System.out.println(2);
	}
	
	default void test3() {
		System.out.println(3);
	}
}
