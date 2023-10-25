package practice_18th_oct;

public class D {
	D(){
		System.out.println(200);
	}
	
	D(int x){
		this();
	}
	
	public static void main(String[] args) {
		D d1 = new D();
	}
}
