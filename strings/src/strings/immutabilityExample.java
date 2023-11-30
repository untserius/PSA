package strings;

final public class immutabilityExample {
	
	private final int age;
	private final String name;
	
	public immutabilityExample(int age, String name){
		this.age = age;
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getName() {
		return name;
	}
	
	public static void main(String[] args) {
		immutabilityExample a1 = new immutabilityExample(20, "Sudhir");
		System.out.println(a1.getAge());
		System.out.println(a1.getName());
	}
	
}
