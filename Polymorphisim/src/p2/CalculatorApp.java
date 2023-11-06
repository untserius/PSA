package p2;

public class CalculatorApp implements Calculator {
	
	@Override
	public int add(int x, int y) {
		return x+y;
	}

	@Override
	public double add(double x, double y) {
		return x+y;
	}

	@Override
	public int multiply(int x, int y) {
		return x*y;
	}

	@Override
	public double multiply(double x, double y) {
		return x*y;
	}

	@Override
	public int divide(int x, int y) {
		return x/y;
	}

	@Override
	public double divide(double x, double y) {
		return x/y;
	}

	@Override
	public int sub(int x, int y) {
		return x-y;
	}

	@Override
	public double sub(double x, double y) {
		return x-y;
	}

	@Override
	public int square(int x) {
		return x*x;
	}

	@Override
	public double square(double x) {
		return x*x;
	}
	
	public static void main(String[] args) {
		CalculatorApp app = new CalculatorApp();
		
		System.out.println(app.divide(10, 2));
		System.out.println(app.add(10, 2));
		System.out.println(app.sub(10, 2));
		System.out.println(app.multiply(10, 2));
		System.out.println(app.square(10));
		
	}
}
