package loops_conditionals;

import java.util.Scanner;

public class H {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < 3; i++) {
			System.out.println("Enter the pin number: ");
			int pinNumber = sc.nextInt();
			
			if(pinNumber == 1234) {
				System.out.println("Welcome");
				break;
			} else {
				System.out.println("Invalid pin number");
			}
			
			if(i == 2) {
				System.out.println("Card is blocked!");
			}
		}
	}
}
