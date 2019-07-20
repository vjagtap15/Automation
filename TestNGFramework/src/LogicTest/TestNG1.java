package LogicTest;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNG1 
{
	
	@Test(priority=1)
	public void test2()
	{
		System.out.println("Test 2");
		Assert.assertEquals("Anand", "nand");
	}
	
	@Test(priority=0)
	public void test3()
	{
		System.out.println("Test 3");
	
	}

	@Test(priority=2)
	public void test1()
	{
		System.out.println("Test 1");
	
	}
	
}
