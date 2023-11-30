package strings;

//wait and notify
public class A {
	public static void main(String[] args) {
		B b1 = new B();
		b1.start();
		
		synchronized (b1) {
			try {
				b1.wait();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println(b1.total);
	}
}
