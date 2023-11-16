package arrays;

public class B {
	public static void main(String[] args) {
		String[] name = new String[4];
		
		name[0] = "John";
		name[1] = "Jose";
		name[2] = "Walter";
		name[3] = "Mike";
		// name[4] = "Harry";
		
		System.out.println(name[0]);
		System.out.println(name[1]);
		System.out.println(name[2]);
		System.out.println(name[3]);
		// System.out.println(name[4]); IndexOutOfBoundsException
	}
}
