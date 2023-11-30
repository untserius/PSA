package strings;

public class startEnd {
	public static void main(String[] args) {
		String str = "aaabccdzzz";
		
		System.out.println(str.startsWith("a"));
		System.out.println(str.endsWith("z"));
		System.out.println(str.startsWith("b"));
		System.out.println(str.endsWith("c"));
	}
}
