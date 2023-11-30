package strings;

public class threading extends Thread{
	@Override
	public void run() {
		for(int i = 0; i < 10000; i++) {
			System.out.println("run");
		}
	}
	
	public static void main(String[] args) {
		threading a1 = new threading();
		a1.start();
		for(int i = 0; i < 10000; i++) {
			System.out.println("main");
		}
		
	}
}
