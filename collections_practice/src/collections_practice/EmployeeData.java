package collections_practice;

import java.util.LinkedList;

public class EmployeeData {
	public static void main(String[] args) {
		Employee arun = new Employee("Arun", "Sethi", 100);
		Employee ravi = new Employee("Ravi", "Kishor", 200);
		Employee santosh = new Employee("Santosh", "Mishra", 300);
		
		LinkedList<Employee> empDetails = new LinkedList<Employee>();
		
		empDetails.add(arun);
		empDetails.add(ravi);
		empDetails.add(santosh);
		
		System.out.println(empDetails);
		
		for (Employee e : empDetails) {
			System.out.println(e.getFirstName());
			System.out.println(e.getLastName());
			System.out.println(e.getId());
		}
	}
}
