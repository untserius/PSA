package p2;

public class Car extends Vehicle {
	
	@Override
	public void drive() {
		System.out.println("Car is getting repaired!");
	}
	
	public static void main(String[] args) {
		Car c1 = new Car();
		c1.drive();
	}
}
