package p3;

public class Rectangle extends Shape {
	double length;
	double width;
	
	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}
	
	@Override
	public double getArea() {
		return length*width;
	}
	
	public static void main(String[] args) {
		Rectangle rec = new Rectangle(3.0, 6.0);
		double area = rec.getArea();
		System.out.println(area);
	}
}
