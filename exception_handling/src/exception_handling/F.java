package exception_handling;

public class F {
	public static void main(String[] args) {
		try {
			int x = 10/0;
			System.out.println(x);
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("Success");
	}
}
