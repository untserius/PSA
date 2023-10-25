package practice_18th_oct;

public class A {
	int x = 10;
	public static void main(String[] args) {
		A a1 = new A();
		System.out.println(a1.x);		//calling through line 6
		a1.test();					//calling through line 11
	}
	public void test() {
		System.out.println(this.x);
	}
}
