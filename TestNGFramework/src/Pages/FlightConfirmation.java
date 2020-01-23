package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FlightConfirmation 
{
	WebDriver dr;
	
	public FlightConfirmation(WebDriver dr)
	{
		this.dr=dr;
	}
	
	By confirmation=By.xpath("//font[contains(text(),'itinerary has been booked')]");
}
