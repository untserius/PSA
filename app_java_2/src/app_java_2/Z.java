package app_java_2;

public class Z {
	Z(int x){					//	datatype = int
		System.out.println(x);
	}
	
	Z(char x){					//	datatype = char
		System.out.println(x);	
	}
	
	Z(String x){				//	datatype = String
		System.out.println(x);
	}
	
	public static void main(String[] args) {
		Z z1 = new Z(150);
		Z z2 = new Z('a');
		Z z3 = new Z("serius");
	}
}
