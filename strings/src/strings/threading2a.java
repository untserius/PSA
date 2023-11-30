package strings;

public class threading2a {
	public static void main(String[] args) {
		threading2 t1 = new threading2("xxx");
		threading2 t2 = new threading2("xyz");
		threading2 t3 = new threading2("abc");
		
		t1.start();
		t2.start();
		t3.start();
	}
}
