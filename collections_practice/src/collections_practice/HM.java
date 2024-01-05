package collections_practice;

import java.util.HashMap;
import java.util.Map;

public class HM {
	public static void main(String[] args) {
		Map<Integer, String> studentInfo = new HashMap<>();
		studentInfo.put(100, "Sudhir");
		studentInfo.put(101, "Sahil");
		studentInfo.put(102, "Vivek");
		studentInfo.put(103, "Bala");
		studentInfo.put(104, "Sritam");
		
		System.out.println(studentInfo);
		
		System.out.println(studentInfo.get(103));
		System.out.println(studentInfo.values());
		System.out.println(studentInfo.keySet());
	}
}
