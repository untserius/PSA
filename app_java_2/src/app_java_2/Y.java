package app_java_2;

public class Y {
	Y(){							// no. of args = 0
		System.out.println("Y");
	}
	
	Y(int x){						// no. of args = 1
		System.out.println(x);
	}
	
	Y(int x, int y){				// no. of args = 2
		System.out.println(x);
		System.out.println(y);		
	}
	
	public static void main(String[] args) {
		Y y1 = new Y();
		Y y2 = new Y(100);
		Y y3 = new Y(200, 300);
	}
}
