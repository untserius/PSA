package loops_conditionals;

import java.util.Scanner;

public class J {
	public static void main(String[] args) {
		String cdn = "yes";
		Scanner sc = new Scanner(System.in);
		
		while(cdn.equals("yes")){
			System.out.println("Enter the amount: ");
			int amount = sc.nextInt();
			System.out.println("Please collect Rs: " + amount);
			
			System.out.println("Do you want to continue(yes/no)");
			cdn = sc.next();
		}
	}
}
