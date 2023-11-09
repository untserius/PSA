package p4;

public class Employee {
	
	private int salary;
	
	public Employee(int salary) {
		this.salary = salary;
	}
	
	public void work() {
		System.out.println("Work..");
	}
	
	public int getSalary() {
		return salary;
	}
}
