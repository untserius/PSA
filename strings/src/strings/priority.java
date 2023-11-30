package strings;

public class priority extends Thread {
	String name;
	priority(String name){
		this.name = name;
	}
	
	public static void main(String[] args) {
		priority a1 = new priority("xxxx");
		priority a2 = new priority("yyyy");
		
		a2.setPriority(10);
		a1.setPriority(1);
		
		System.out.println(a1.getPriority());
		System.out.println(a2.getPriority());
		
		a1.start();
		a2.start();
	}
	
	public void run() {
		System.out.println();
	}
}
