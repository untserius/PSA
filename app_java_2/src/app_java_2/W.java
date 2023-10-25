package app_java_2;

public class W {
	public static void main(String[] args) {
		W w1 = new W(); // local variable w1
		System.out.println(w1);
	}
	public void test() {
		System.out.println(w1);// Error - outside main method
	}
}
