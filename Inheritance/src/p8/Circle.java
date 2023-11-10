package p8;

public class Circle extends Shape {
	
	private double radius;
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	@Override
	public double getPerimeter() {
		return 2*Math.PI*radius;
	}
	
	@Override
	public double getArea() {
		return Math.PI*Math.pow(radius, 2);
	}
	
	public static void main(String[] args) {
		Circle circle = new Circle(12);
		System.out.println((float)circle.getPerimeter());
		System.out.println((float)circle.getArea());
	}
}
