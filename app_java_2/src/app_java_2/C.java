package app_java_2;

public class C {
	static int x = 10;
	public static void main(String[] args) {
		System.out.println(C.x); //10
		A a1 = new A();
		a1.test();
	}
	public void test() {
		System.out.println(x); //10
	}
}
