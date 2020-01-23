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

/*
 * 1. Launch the browser
 * 2. Navigate to the application
 * 3. Login in the application
 * 4. Enter details on flight finder
 * 
 */

public class TestScript2 {
	WebDriver dr;
	

	@Test(priority=0)
	public void LoginTest() {
		// Launch Browser
		ApplicationLibraries lib = new ApplicationLibraries();

		dr = lib.launchBrowser();
		
	}

	@Test(priority=1, dataProvider = "getdata2")
	public void OneWayFlightBkg(String DepartingFrom, String ServiceClass) throws InterruptedException {
		
		dr.get(Config.appurl);
		
		HomePage page1 = new HomePage(dr);
		page1.login(Config.username, Config.password);

		// Book Flight.
		FlightFinder flightfinderpage = new FlightFinder(dr);
		flightfinderpage.clickOneWay();
		
		//Select City
		flightfinderpage.selectDepartingFrom(DepartingFrom);
		
		Thread.sleep(5000);
		
		//Select Service Class
		flightfinderpage.selectServiceClass(ServiceClass);
		
		Thread.sleep(5000);
		
		flightfinderpage.clickContinuebtn();
		

		
	}

	@DataProvider
	public String[][] getdata2() throws IOException {
		Xls_Reader xl = new Xls_Reader(Config.testdata);
		int rows = xl.getrowcount("OnewayFlight");
		int cols = xl.getColumncount("OnewayFlight");

		String[][] data = new String[rows - 1][cols];

		for (int r = 2; r <= rows; r++) {
			for (int c = 1; c <= cols; c++) {
				data[r - 2][c - 1] = xl.getCellData("OnewayFlight", r, c);
			}
		}
		return data;
	}

}
