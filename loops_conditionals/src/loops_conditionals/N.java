package loops_conditionals;

public class N {
	public static void main(String[] args) {
		for(int i=0; i<10; i++) {
			if(i == 2) {
				continue;
			}
			System.out.println(i);
		}
	}
}
