package strings;

public class threading2 extends Thread {
	
	String name;
	threading2(String name){
		this.name = name;
	}
	
	@Override
	public void run() {
		for(int i = 0; i < 10000; i++) {
			System.out.println(this.name);
		}
	}
}
