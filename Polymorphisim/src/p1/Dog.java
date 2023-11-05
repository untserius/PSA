package p1;

public class Dog extends Cat {
	public void noise() {
		System.out.println("Bark...");
	}
	
	public static void main(String[] args) {
		Dog dog = new Dog();
		Cat cat = new Cat();
		
		cat.sleep();
		cat.eat();
		cat.noise();
		
		dog.sleep();
		dog.eat();
		dog.noise();
	}
}
