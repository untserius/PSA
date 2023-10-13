package app_java_2;

public class D {
	static int x;
	public static void main(String[] args) {
		int x = 20; //local-variable
		System.out.println(D.x); //0
		System.out.println(x); //20
	}
}
