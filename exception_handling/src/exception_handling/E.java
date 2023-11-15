package exception_handling;

public class E {
	public static void main(String[] args) {
		try {
			String x = "rcdevcbv";
			int y = Integer.parseInt(x);
			System.out.println(y);
		} catch(NumberFormatException e) {
			e.printStackTrace();
		}
		System.out.println("Success");
	}
}
