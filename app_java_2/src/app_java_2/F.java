package app_java_2;

public class F {
	int x = 10; // non-static variable
	public static void main(String[] args) {
		int x = 20; // local variable
		System.out.println(x); // 20
		
		F a1 = new F();
		System.out.println(a1.x); // 10
	}
}
