package collection;

import java.util.TreeSet;

public class TressSetCollection {

	public static void main(String[] args) {
		
		TreeSet<String> set = new TreeSet<>();
		
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
