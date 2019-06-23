package collection;

import java.util.LinkedHashSet;

public class LinkedHashedSetCollection {

	public static void main(String[] args) {
		
		LinkedHashSet<String> set = new LinkedHashSet<>();
		
		set.add("Name");
		set.add("Surname");
		set.add("Address");
		
		set.add("Name");
		set.add("Surname");
		set.add("Address");
		
		for(String s:set)
		{
			System.out.println(s);
		}
		
		

	}

}
