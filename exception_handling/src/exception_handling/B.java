package exception_handling;

public class B {
	public static void main(String[] args) {
		try {
			int x = 10;
			int y = 0;
			int z = x/y; //Stop 
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("Success");
	}
}
