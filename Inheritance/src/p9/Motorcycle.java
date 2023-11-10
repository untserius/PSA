package p9;

public class Motorcycle extends Vehicle {
	private double engineDisplacement;
	
	public Motorcycle(String make, String model, int year, String fuelType, double fuelEfficiency, double engineDisplacement) {
		super(make, model, year, fuelType, fuelEfficiency);
		this.engineDisplacement = engineDisplacement;
	}
	
	public double getEngineDisplacement() {
		return engineDisplacement;
	}
	
	@Override
	public double calculateFuelEfficiency() {
		return getFuelEfficiency() * (1.0 / (1.0 + (getEngineDisplacement() / 1000.0)));
	}
	
	@Override
	public double calculateDistanceTraveled() {
		return calculateFuelEfficiency() * getFuelEfficiency();
	}
	
	@Override
	public double getMaxSpeed() {
		return 80.0;
	}
	
	public static void main(String[] args) {
		Truck truck = new Truck("Toyota", "Tundra TRD PRO", 2022, "Gasoline", 4.23, 2.2);
		Car car = new Car("Land Rover", "Defender", 2023, "Petrol", 5.7, 5);
		Motorcycle bike = new Motorcycle("Royal Enfield", "Himalayan", 2022, "Petrol", 28, 411);
	
		System.out.println("Truck Specifications: " + "\n");
		System.out.println("Model: " + truck.getMake() + " " + truck.getModel());
		System.out.println("Year: " + truck.getYear());
		System.out.println("Top Speed: " + truck.getMaxSpeed() + " KM/h");
		System.out.println("Load Capacity: " + truck.getCargoCapacity() + " tonne");
		System.out.println("Fuel Type: " + truck.getFuelType());
		System.out.println("Fuel Efficiency: " + truck.calculateFuelEfficiency() + " kmpl");
		System.out.println("Distance Traveled: " + truck.calculateDistanceTraveled() + " KM" + "\n");
		
		System.out.println("Car Specifications: " + "\n");
		System.out.println("Model: " + car.getMake() + " " + car.getModel());
		System.out.println("Year: " + car.getYear());
		System.out.println("Top Speed: " + car.getMaxSpeed() + " KM/h");
		System.out.println("Capacity: " + car.getNumSeats() + " seater");
		System.out.println("Fuel Type: " + car.getFuelType());
		System.out.println("Fuel Efficiency: " + car.calculateFuelEfficiency() + " kmpl");
		System.out.println("Distance Traveled: " + car.calculateDistanceTraveled() + " KM" + "\n");

		System.out.println("Bike Specifications: " + "\n");
		System.out.println("Model: " + bike.getMake() + " " + bike.getModel());
		System.out.println("Year: " + bike.getYear());
		System.out.println("Engine Displacemnt(cc): " + bike.getEngineDisplacement());
		System.out.println("Top Speed: " + bike.getMaxSpeed() + " KM/h");
		System.out.println("Fuel Type: " + bike.getFuelType());
		System.out.println("Fuel Efficiency: " + bike.calculateFuelEfficiency() + " kmpl");
		System.out.println("Distance Traveled: " + bike.calculateDistanceTraveled() + " KM");
		
		
	}

}
