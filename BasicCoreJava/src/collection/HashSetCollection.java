package collection;

import java.util.HashSet;

public class HashSetCollection {

	public static void main(String[] args)
	{
		HashSet<String> set = new HashSet<>();
		
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
