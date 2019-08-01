package TestScripts;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Configuration.Config;
import Libraries.ApplicationLibraries;
import Pages.HomePage;
import Utilities.Xls_Reader;

public class TestScript1 
{
	SoftAssert asser;
	
	@BeforeMethod
	public void setup()
	{
		asser = new SoftAssert();
		
	}
	
	@AfterMethod
	public void teardown()
	{
		asser.assertAll();
	}
	
	@Test(dataProvider="getdata2")
	public void loginTest(String Username, String Password, String title)
	{
		//Launch Browser
		  ApplicationLibraries lib = new ApplicationLibraries();
		  
		  WebDriver dr=lib.launchBrowser();
		  
		  HomePage page1 = new HomePage(dr);
		  
		  page1.login(Username, Password);
		  
		/*
		 * System.out.println(title); System.out.println(dr.getTitle());
		 * System.out.println("******************");
		 */
		  
		  //Assert.assertEquals(dr.getTitle(), title); ---- Hard Assertion
		  
		  asser.assertEquals(dr.getTitle(), title);
		  
		  dr.quit();
		 
	}
	
	@DataProvider
	public String[][] getdata2() throws IOException 
	{
		Xls_Reader xl = new Xls_Reader(Config.testdata);
		int rows=xl.getrowcount("TestData");
		int cols=xl.getColumncount("TestData");
		
		String[][] data = new String [rows-1][cols];
		
		for (int r=2; r<=rows; r++)
		{
			for(int c=1; c<=cols; c++)
			{
				data[r-2][c-1]=xl.getCellData("TestData", r, c);
			}
		}
		return data;
	}


}
