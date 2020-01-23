package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class FlightFinder 

{
	WebDriver dr;
	
	public FlightFinder(WebDriver dr)
	{
		this.dr=dr;
	}
	
	By oneway=By.xpath("//input[@value='oneway']");
	By continuebtn=By.name("findFlights");
	By departingFrom=By.name("fromPort");
	By serviceClass1=By.xpath("//input[@value='Coach']");
	By serviceClass2=By.xpath("//input[@value='Business']");
	By serviceClass3=By.xpath("//input[@value='First']");
	
	public void clickOneWay()
	{
		dr.findElement(oneway).click();
	
	}
	
	public void clickContinuebtn()
	{
		dr.findElement(continuebtn).click();
	}
	
	public void selectDepartingFrom(String cityName)
	{
		Select obj= new Select(dr.findElement(departingFrom));
		obj.selectByVisibleText(cityName);
	}
	
	public void selectServiceClass(String serviceClassname)
	{
		if(serviceClassname.toLowerCase().equalsIgnoreCase("business class"))
		{
			dr.findElement(serviceClass2).click();
		}else if(serviceClassname.toLowerCase().equalsIgnoreCase("first class")){
			dr.findElement(serviceClass3).click();
		}else if(serviceClassname.toLowerCase().equalsIgnoreCase("economy class")) {
			dr.findElement(serviceClass1).click();
		}else {
			throw new NoSuchElementException(serviceClassname);
		}
		
	}
}
