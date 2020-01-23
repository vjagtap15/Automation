package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BookFlight 
{
	WebDriver dr;
	
	public BookFlight(WebDriver dr)
	{
		this.dr=dr;
	}
	
	By securePurchase=By.name("buyFlights");
}
