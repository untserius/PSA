package app_java_2;

public class H {
	public static void main(String[] args) {
		H a1 = new H();
		a1.test();
	}
	public void test() { //non-static
		System.out.println(100); // 100
	}
}
