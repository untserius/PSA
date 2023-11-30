package strings;

public class syncProblem {
	int balance = 0;
	
	public static void main(String[] args) {
		syncProblem a1 = new syncProblem();
		a1.account();
		System.out.println(a1.balance);
	}
	
	public void account() {
		Thread t1 = new Thread (new Runnable() {
		
		@Override
		public void run() {
			add();
		}
	});
		
		Thread t2 = new Thread ( new Runnable() {
			@Override
			public void run() {
				sub();
			}
		});
	
		t1.start();
		t2.start();
	
		try {
			t1.join();
			t2.join();
		}catch(Exception e) {
				System.out.println(e);
		}
	}
	
	public synchronized void add() {
		for(int i = 0; i < 10000; i++) {
			balance = balance + i;
		}
	}
	
	public synchronized void sub() {
		for(int i = 0; i < 10000; i++) {
			balance = balance - i;
		}
	}
}
