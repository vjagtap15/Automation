package basicAnnotation;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Test2 
{
	@BeforeTest 
	public void beforeTest()
	{
		System.out.println("Before Test2");
	}
	
	@AfterTest 
	public void afterTest()
	{
		System.out.println("After Test2");
	}
}
