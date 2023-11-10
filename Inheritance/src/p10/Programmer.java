package p10;

public class Programmer extends Developer {
	public Programmer(String name, String address, double salary, String programmingLanguage) {
		super(name, address, salary, "Programmer", programmingLanguage);
	}
	
	@Override
	public double calculateBonus() {
		return getSalary() * 0.12;
	}
	
	@Override
	public String generatePerformanceReport() {
		return "Performance report for Programmer " + getName() + ": Excellent";
	}
	
	public void debugCode() {
		System.out.println("Programmer " + getName() + " is debugging code in " + getProgrammingLanguage());
	}
	
	public static void main(String[] args) {
		Manager manager = new Manager("Sudhir Das", "1 ABC St", 80000.0, "Manager", 5);
		Developer developer = new Developer("Subhransu Sekhar", "2 PQR St", 72000.0, "Developer", "Java");
		Programmer programmer =  new Programmer("Swayangsu", "3 ABC St", 76000.0, "Python");
		
		System.out.println("Manager's Bonus: $" + manager.calculateBonus());
		System.out.println("Developer's Bonus: $" + developer.calculateBonus());
		System.out.println("Programmer's Bonus: $" + programmer.calculateBonus() + "\n");
		
		System.out.println(manager.generatePerformanceReport());
		System.out.println(developer.generatePerformanceReport());
		System.out.println(programmer.generatePerformanceReport() + "\n");
		
		manager.manageProject();
		developer.writeCode();
		programmer.debugCode();
	}
}
