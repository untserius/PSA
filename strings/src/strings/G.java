package strings;

public class G extends Object {
	protected void finalise() {
		System.out.println(10000);
	}
	
	public static void main(String[] args) {
		G g1 = new G();
		g1 = null;
		System.gc();
	}
}
