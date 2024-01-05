package collections_practice;

import java.util.Hashtable;

public class HT {
	public static void main(String[] args) {
		Hashtable<Integer, String> hashTable  = new Hashtable<>();
		hashTable.put(100, "sudhir");
		hashTable.put(120, "serius");
		hashTable.put(90, "vinay");
		
		System.out.println(hashTable);
	}
}
