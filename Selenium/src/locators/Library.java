package locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Library 

{
	public WebDriver launchBrowser()
	
	{
		System.setProperty("webdriver.chrome.driver", "C:\\SE_26052019\\Drivers\\chromedriver.exe");

		ChromeDriver dr = new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("http://www.newtours.demoaut.com/");
		return dr;
	}
	
	public WebDriver launchBrowser(String url)
	
	{
		System.setProperty("webdriver.chrome.driver", "C:\\SE_26052019\\Drivers\\chromedriver.exe");
		ChromeOptions op = new ChromeOptions();
		op.addArguments("--disable-infobars");
		op.addArguments("--start-maximized");		
		ChromeDriver dr = new ChromeDriver(op);
		dr.get(url);
		return dr;
	}
		
	

}
