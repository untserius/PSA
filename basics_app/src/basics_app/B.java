package basics_app;

public class B {
	public static void main(String[] args) {
		B b1 = new B(10, 34);
		System.out.println(b1.sum());
	}
	
	private int x;
	private int y;
	
	public B(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public int sum() {
		return x+y; 
	}
}
