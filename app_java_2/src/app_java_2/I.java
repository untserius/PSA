package app_java_2;

public class I {
	public static void main(String[] args) {
		I a1 = new I();
		int val = a1.test();
		System.out.println(val); //10
	}
	public int test() {
		return 10;
	}
}
