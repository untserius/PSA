package practice_18th_oct;

public class F {
	F(String y){
		System.out.println(y);
	}
	
	F(int x){
		this("mike");
	}
	
	F(){
		this(56);
	}
	public static void main(String[] args) {
		F f1 = new F();
	}
}
