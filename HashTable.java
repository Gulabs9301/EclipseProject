package collectionBasic;

import java.util.Hashtable;

public class HashTable {
	public static void main(String[] args) {
		Hashtable<Integer, String> names = new Hashtable<>(10);
		names.put(1, "Naveen");
		names.put(2, "Guna");
		names.put(3, "John");
		names.put(4, "Guru");
		for (Integer x : names.keySet()) {
			System.out.println(x.hashCode() % 10 + "" + names.get(x));
		}
	}

}
