package p3;

public class F {
	public static void main(String[] args) {
		E e1 = ()->{
			System.out.print("Calm ");
		};
		
		E e2 = ()-> {
			System.out.println("down!");
		};
		
		E e3 = ()->{
			System.out.print("Its ");
		};
		
		E e4 = ()->{
			System.out.println("okay");
		};
		
		e1.test1();
		e2.test1();
		e3.test1();
		e4.test1();
	}
}
