package exceptionhandeling;

public final class FinalKeyword {

	// Final - Class => Can't Extent
	// Final - Variable => Can't reinitialize
	// Final - Method => Can't Override
	
	public final static String name = "anand";
	
	public static void main(String[] args)
	{
		//name="abc"; 
	}
	
	public final void test()
	{
		System.out.println("Test");
		
	}

}
