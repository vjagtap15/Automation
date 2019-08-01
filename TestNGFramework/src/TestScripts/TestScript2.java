package TestScripts;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Configuration.Config;
import Libraries.ApplicationLibraries;
import Pages.FlightFinder;
import Pages.HomePage;
import Utilities.Xls_Reader;

public class TestScript2 
{
	@Test(dataProvider="getdata2")
	public void OneWayFlightBkg(String Username, String Password, String DepartingFrom, String ServiceClass)
	{
		//Launch Browser
		  ApplicationLibraries lib = new ApplicationLibraries();
		  WebDriver dr=lib.launchBrowser();
		  HomePage page1 = new HomePage(dr);
		  page1.login(Username, Password);
		  
		  //Book Flight.
		  FlightFinder flightfinderpage = new FlightFinder(dr);
		  flightfinderpage.clickOneWay();
		  flightfinderpage.clickContinuebtn();
		  
		/*
		 * System.out.println(title); System.out.println(dr.getTitle());
		 * System.out.println("******************");
		 */
		  
		  //Assert.assertEquals(dr.getTitle(), title); ---- Hard Assertion
		  SoftAssert asser = new SoftAssert();
		  //asser.assertEquals(dr.getTitle(), title);
		  asser.assertAll();
		  
		  dr.quit();
		 
	}

	@DataProvider
	public String[][] getdata2() throws IOException 
	{
		Xls_Reader xl = new Xls_Reader(Config.testdata);
		int rows=xl.getrowcount("OnewayFlight");
		int cols=xl.getColumncount("OnewayFlight");
		
		String[][] data = new String [rows-1][cols];
		
		for (int r=2; r<=rows; r++)
		{
			for(int c=1; c<=cols; c++)
			{
				data[r-2][c-1]=xl.getCellData("OnewayFlight", r, c);
			}
		}
		return data;
	}

}
