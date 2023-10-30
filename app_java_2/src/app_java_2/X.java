package app_java_2;

public class X {
	public static void main(String[] args) {
		X x1 = new X(); // local
		System.out.println(x1);
		x1.test();
	}
	
	public void test() {
	//	System.out.println(x1); // Error
	}
}
