package mapinterface;

import java.util.HashMap;

public class HashMapClass {

	public static void main(String[] args) {
		
		HashMap<Integer, String> map = new HashMap<>();
		
		map.put(1, "Vijay");
		map.put(2, "K");
		map.put(3, "Jagtap");
		map.put(1, "Sanjay");
		
		map.put(null, "Deepak");
		
		System.out.println(map.get(1));
		
		System.out.println(map.get(null)); // Hashmap allows null value
	}

}
