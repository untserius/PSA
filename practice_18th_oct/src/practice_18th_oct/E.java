package practice_18th_oct;

public class E {
	E(int x){
		System.out.println(x);
	}
	
	E(){
		this(100);
	}
	public static void main(String[] args) {
		E e1 = new E();
	}
}
