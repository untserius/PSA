package p1;

public class Cat extends Animal {
	
	@Override
	public void makeSound() {
		System.out.println("Cat sound");
	}
	
	public static void main(String[] args) {
		Cat c = new Cat();
		c.makeSound();
	}
	
}
