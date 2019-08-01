package basicAnnotation;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Test1 
{
	@BeforeTest 
	public void beforeTest()
	{
		System.out.println("Before Test1");
	}
	
	@AfterTest 
	public void afterTest()
	{
		System.out.println("After Test1");
	}
}
