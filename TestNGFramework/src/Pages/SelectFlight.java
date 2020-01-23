package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SelectFlight 
{
	WebDriver dr;
	
	public SelectFlight(WebDriver dr)
	{
		this.dr=dr;
	}
	
	By continuebtn=By.name("reserveFlights");
}
