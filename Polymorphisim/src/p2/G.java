package p2;

public class G extends F{
	public static void main(String[] args) {
		G g1 = new G();
		g1.test();
	}
	
	@Override
	public void test() {
		System.out.println(500);
	}
}
