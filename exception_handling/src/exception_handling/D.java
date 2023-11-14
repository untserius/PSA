package exception_handling;

public class D {
	int x = 10;
	public static void main(String[] args) {
		try {
			D d1 = null;
			System.out.println(d1.x);
		} catch (NullPointerException e) {
			e.printStackTrace();
		}
		System.out.println("Success");
	}
}
