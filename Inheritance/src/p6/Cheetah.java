package p6;

public class Cheetah extends Animal{
	@Override
	public void move() {
		System.out.println("Cheetah is running!");
	}
	
	public static void main(String[] args) {
		Cheetah c1 = new Cheetah();
		c1.move();
		
		Animal a1 = new Animal();
		a1.move();
	}
}
