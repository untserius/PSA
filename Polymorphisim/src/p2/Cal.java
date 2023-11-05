package p2;

public class Cal {
	int add(int a, int b) {
		return a+b;
	}
	double add(double a, double b) {
		return a+b;
	}
	
	public static void main(String[] args) {
		Cal c = new Cal();
		double val = c.add(34.6, 14.4); 
		System.out.println(val);
	}
}
