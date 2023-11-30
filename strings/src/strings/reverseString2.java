package strings;

public class reverseString2 {
	public static void main(String[] args) {
		String str = "   Pankaj Sir Academy ";
		String[] s = str.trim().split(" ");
		
		System.out.println(s.length);
		
		for(String x : s) {
			System.out.println(x);
		}
	}
}
