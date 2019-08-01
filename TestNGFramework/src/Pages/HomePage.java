package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage 
{
	By username = By.name("userName");
	By password = By.name("password");
	By login = By.name("login");
	
	WebDriver dr;
	
	public HomePage(WebDriver dr)
	{
		this.dr=dr;
	}
	
	public void login(String username, String password)
	{
		dr.findElement(this.username).sendKeys(username);
		dr.findElement(this.password).sendKeys(password);
		dr.findElement(login).click();
	}
	
}
