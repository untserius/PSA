package strings;

public class C extends Thread{
	String name;
	C(String name){
		this.name = name;
	}
	
	public static void main(String[] args) {
		C c1 = new C("xxxx");
		C c2 = new C("yyyy");
		c1.setName("addAmount");
		c2.setName("withdrawAmount");
		
		System.out.println(c1.getName());
		System.out.println(c2.getName());
		
		c1.start();
		c2.start();
	}
	
	public void run() {
		System.out.println(this.name);
	}
}
