package p4;

public class B {
	public static void main(String[] args) {
		A a1 = (String x, int y)->{
			System.out.println(x + y);
		};
		
		a1.test("The no is: ", 12);
	}
}
