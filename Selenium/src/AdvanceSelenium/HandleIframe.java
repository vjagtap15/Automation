package AdvanceSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import locators.Library;

public class HandleIframe {

	public static void main(String[] args) throws InterruptedException 
	{
		Library lib = new Library();		
		WebDriver dr=lib.launchBrowser("https://paytm.com/");
		
		Thread.sleep(3000);
		
		dr.findElement(By.xpath("//div[text()='Log In/Sign Up']")).click();
		
		Thread.sleep(3000);
		
		//dr.switchTo().frame(0);
		dr.switchTo().frame(dr.findElement(By.tagName("iframe")));
		
		dr.findElement(By.xpath("//span[text()='Login/Signup with mobile number and password']")).click();
		

	}

}
