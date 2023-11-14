package exception_handling;

public class C {
	public static void main(String[] args) {
		try {
			int x = 10;
			int y = 0;
			int z = x/y;
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}
		System.out.println("Success");
	}
}
