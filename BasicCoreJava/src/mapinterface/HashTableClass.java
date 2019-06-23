package mapinterface;

import java.util.Hashtable;

public class HashTableClass {

	public static void main(String[] args) {
		
		Hashtable<Integer, String> map = new Hashtable<>();
		
		map.put(1, "Vijay");
		map.put(2, "K");
		map.put(3, "Jagtap");
		map.put(1, "Sanjay");
		
		map.put(null, "Deepak");
		
		System.out.println(map.get(1));
		
		System.out.println(map.get(null)); // Hashtable do not allows null value
		
		

	}

}
