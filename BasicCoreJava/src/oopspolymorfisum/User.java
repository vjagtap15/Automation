package oopspolymorfisum;

public class User {

	public static void main(String[] args) 
	{
		int        a=10; 
		Function obj= new Function(); //Define Object 
		String   str="Anand";
		
		
		int sum=obj.sum(10,20);
		System.out.println(sum);
		
		sum=obj.sum(10,20,30);
		System.out.println(sum);
		
		
	}

}
