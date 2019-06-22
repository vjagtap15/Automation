package exceptionhandeling;

public class ThrowKeyword {

	public static void main(String[] args) throws Exception
	{
		// Throw keyword used to display user defined exception
		
		test(10, 0);

	}
	
	public static void test(int a, int b) throws Exception
	{
		if(b==0)
			throw new Exception("The Value of b is zero");
		
	}
}
