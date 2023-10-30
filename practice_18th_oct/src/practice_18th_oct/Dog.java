package practice_18th_oct;


public class Dog extends Animal {
	public void noise() {
		System.out.println("Bark....");
	}
	public static void main(String[] args) {
		Dog d = new Dog();
		d.sleep();
		d.eat();
		d.noise();
	}
}

