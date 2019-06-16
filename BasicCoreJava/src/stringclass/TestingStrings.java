package stringclass;

public class TestingStrings {

	public static void main(String[] args)
	{
		
		String str="vijay";
		String str2="Vijay";
		String test="My name is Vijay J";
		
		//1. CharAt
		System.out.println(str.charAt(3));
		
		//2. Length
		System.out.println(str.length());
		
		//3.Equals
		System.out.println(str.equals(str2));
		
		//4. EqualsIgnarecase
		System.out.println(str.equalsIgnoreCase(str2));
		
		//5. Replace
		System.out.println(str.replace(str, "VIJAY"));
		
		//6. Split
		String[] arr=(test.split(" "));
		for(String s:arr)
		{
			System.out.println(s);
		}
		
		//7. Sub String
		System.out.println(str.substring(3));
		System.out.println(str.substring(2, 4));
		
		
		
	}

}
