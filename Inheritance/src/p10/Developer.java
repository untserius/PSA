package p10;

public class Developer extends Employee {
	private String programmingLanguage;
	
	public Developer(String name, String address, double salary, String jobTitle, String programmingLanguage) {
		super(name, address, salary, jobTitle);
		this.programmingLanguage = programmingLanguage;
	}
	
	public String getProgrammingLanguage() {
		return programmingLanguage;
	}
	
	@Override
	public double calculateBonus() {
		return getSalary() * 0.10;
	}
	
	@Override
	public String generatePerformanceReport() {
		return "Performance report for Developer " + getName() + ": Good";
	}
	
	public void writeCode() {
		System.out.println("Developer " + getName() + " is writing code in " + programmingLanguage);
	}
}
