package p3;

public class H {
	public static void main(String[] args) {
		G g1 = (int x, int y)->{
			System.out.println(x+y);
		}; 
		
		G g2 = (int x, int y)->{
			System.out.println(x*y);
		};
		
		G g3 = (int x, int y)->{
			System.out.println(x-y);
		};
		
		G g4 = (int x, int y)->{
			System.out.println(x/y);
		};
		
		g1.cal(10, 20);
		g2.cal(10, 20);
		g3.cal(10, 20);
		g4.cal(10, 20);
	}
}
