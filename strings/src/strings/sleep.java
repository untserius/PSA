package strings;

public class sleep extends Thread {
	public static void main(String[] args) {
		sleep a1 = new sleep();
		System.out.println(a1.getState());
		a1.start();
		
		try {
			Thread.sleep(5000);
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println(a1.getState());
	}
	
	public void run() {
		System.out.println("Test");
	}
}
