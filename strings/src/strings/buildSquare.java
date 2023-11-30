package strings;

public class buildSquare {
	public static void main(String[] args) {
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 5; j++) {
				if(i == 0 && j == 0 
					|| i == 0 && j == 1
					|| i == 0 && j == 3
					|| i == 0 && j == 4
					|| i == 1 && j == 0
					|| i == 1 && j == 4) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println(" ");
		}
	}
}
