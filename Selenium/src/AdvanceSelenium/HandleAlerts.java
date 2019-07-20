package AdvanceSelenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleAlerts {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\SE_26052019\\Drivers\\chromedriver.exe");

		ChromeDriver dr = new ChromeDriver();

		dr.manage().window().maximize();

		dr.get("http://www.newtours.demoaut.com/");
		
		dr.findElement(By.cssSelector("input[name='userName']")).sendKeys("mercury");
		dr.findElement(By.cssSelector("input[name='password']")).sendKeys("mercury");
		dr.findElement(By.name("login")).click();
		
		dr.findElement(By.name("findFlights")).click();
		dr.findElement(By.name("reserveFlights")).click();
		
		Select sel = new Select(dr.findElement(By.name("delCountry")));
		sel.selectByIndex(2);
		Alert al = dr.switchTo().alert();
		System.out.println(al.getText());
		al.accept();
	}

}
