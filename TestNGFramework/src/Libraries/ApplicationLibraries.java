package Libraries;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import Configuration.Config;

public class ApplicationLibraries {
	
	public WebDriver launchBrowser()

	{
		System.setProperty("webdriver.chrome.driver", "Config.chromedriver");
		ChromeDriver dr = new ChromeDriver();
		dr.manage().window().maximize();
		dr.get(Config.appurl);
		return dr;
	}

	public WebDriver launchBrowser(String url)

	{
		System.setProperty("webdriver.chrome.driver", "Config.chromedriver");
		ChromeOptions op = new ChromeOptions();
		op.addArguments("--disable-infobars");
		op.addArguments("--start-maximized");
		ChromeDriver dr = new ChromeDriver(op);
		dr.get(url);
		return dr;
	}

}
