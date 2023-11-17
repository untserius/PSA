package loops_conditionals;

public class M {
	public static void main(String[] args) {
		for(int i = 0; i < 5; i++) {
			if(i == 2) {
				System.out.println("Sorry! Code broke");
				break;
			}
			System.out.println(i);
		}
	}
}
