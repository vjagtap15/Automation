package stringclass;

// Find count of "a" in the String

public class Program {

	public static void main(String[] args) {
		String arr1 = "anadasdhakdkdjaksdjkasdand";

		int count = 0;
		
		// CharAt
		
		/*
		 * for (int i = 0; i < arr1.length(); i++) { if (arr1.charAt(i) == 'a') count++;
		 * 
		 * }
		 * 
		 * System.out.println(count);
		 */	
	
		//Sub String
		
		
		  for (int i = 0; i < arr1.length(); i++) { if(arr1.substring(i,
		  i+1).equals("a")) { count++; } }
		  
		  System.out.println(count);
		 
		
		//Replace
		System.out.println(arr1.length()-arr1.replace("a", "").length());
		
	}

}
