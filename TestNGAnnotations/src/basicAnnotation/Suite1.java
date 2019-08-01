package basicAnnotation;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class Suite1 
{
	@BeforeSuite 
	public void beforeSuite()
	{
		System.out.println("Before Suite");
	}
	
	@AfterSuite 
	public void afterSuite()
	{
		System.out.println("After Suite");
	}
}
