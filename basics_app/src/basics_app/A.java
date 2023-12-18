package basics_app;

public class A {
	private String name;
	private int age;
	
	public A(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	public String introduce() {
		return "My name is " + this.name + " and I am " + this.age + " old.";
	}
	
	public static void main(String[] args) {
		A a1 = new A("Sudhir", 23);
		System.out.println(a1.introduce());
	}
}