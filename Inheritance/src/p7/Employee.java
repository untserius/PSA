package p7;

public class Employee extends Person{
	private int employeeId;
	private String jobTitle;
	
	public Employee(String firstName, String lastName, int employeeId, String jobTitle){
		super(firstName, lastName);
		this.employeeId = employeeId;
		this.jobTitle = jobTitle;
	}
	
	public int getEmployeeId() {
		return employeeId;
	}
	
	@Override
	public String getLastName() {
		return super.getLastName() + ", " + jobTitle;
	}
	
	public static void main(String[] args) {
		Employee e1 = new Employee("Sudhir", "Das", 2234, "Software Engineer");
		System.out.println(e1.getFirstName() + " " + e1.getLastName() + "\n" + "Employee Id: " + e1.employeeId);
		
		
	}
}
