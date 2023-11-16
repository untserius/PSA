package loops_conditionals;

import java.util.Scanner;

public class G {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age: ");
		int val = sc.nextInt();
		
		Scanner sc2 = new Scanner(System.in);
		System.out.println("Enter your full name: ");
		String s = sc2.nextLine();
		
		Scanner sc3 = new Scanner(System.in);
		System.out.println("Enter your cgpa: ");
		float f = sc2.nextFloat();
		
		Scanner sc4 = new Scanner(System.in);
		System.out.println("Are you 18+ ?");
		boolean b = sc4.nextBoolean();
		
		System.out.println(val);
		System.out.println(s);
		System.out.println(f);
		System.out.println(b);
	}
}
