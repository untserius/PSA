package app_java_2;

public class S {
	void S() {					// non-static method
		System.out.println(100);
	}
	public static void main(String[] args) {
		S s1 = new S();
		s1.S();
	}
}
