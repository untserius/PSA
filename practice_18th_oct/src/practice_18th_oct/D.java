package practice_18th_oct;

public class D {
	D(int x){
		System.out.println(x);
	}
	
	D(){
		this(100);
		System.out.println(1);
	}
	
	public static void main(String[] args) {
		D d1 = new D();
	}
}
