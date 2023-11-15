package type_casting;

public class E {
	public static void main(String[] args) {
		String x = "true";
		boolean y = Boolean.parseBoolean(x);
		String a = "hello";
		boolean b = Boolean.parseBoolean(a);
		System.out.println(y); // true
		System.out.println(b); // false 
		
		// everything is false except if we write "true" in a String
		
	}
}
