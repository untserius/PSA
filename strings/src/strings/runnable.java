package strings;

public class runnable implements Runnable{
	
	String name;
	runnable(String name){
		this.name = name;
	}
	
	@Override
	public void run() {
		for(int i = 0; i<10000; i++) {
			System.out.println(this.name);
		}
	}
	
	public static void main(String[] args) {
		runnable r1 = new runnable("xxx");
		Thread t1 = new Thread(r1);
		t1.start();
		
		runnable r2 = new runnable("yyy");
		Thread t2 = new Thread(r2);
		t2.start();
		
		for(int i = 0; i<10000; i++) {
			System.out.println("main");
		}
	}
}
