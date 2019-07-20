package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\SE_26052019\\Drivers\\chromedriver.exe");

		ChromeDriver dr = new ChromeDriver();

		dr.manage().window().maximize();

		dr.get("http://www.newtours.demoaut.com/");
		
		//CSS selector
		
		dr.findElement(By.cssSelector("input[name='userName']")).sendKeys("qeqwewqe");
		dr.findElement(By.cssSelector("input[name='password']")).sendKeys("qweqwe");
		dr.findElement(By.name("login")).click();
		
		//Link text and Partial link
		
		//dr.findElement(By.linkText("REGISTER")).click();
		
		// Partial Link Text
		//dr.findElement(By.partialLinkText("REGIS")).click();
		
		// Xpath
		
		//dr.findElement(By.xpath("//a[@href='mercuryregister.php']")).click();
		//dr.findElement(By.xpath("//a[contains(@href,'mercuryregist')]")).click();
		//dr.findElement(By.xpath("//a[starts-with(text(),'REGIS')]")).click();
		//dr.findElement(By.xpath("//a[@href='mercuryregister.php'][text()='REGISTER']")).click();
		//dr.findElement(By.xpath("//a[@href='mercuryregister.php' and text()='REGISTER']")).click();
		//dr.findElement(By.xpath("//a[@href='mercuryregister.php' or text()='REGISTER']")).click();
		//dr.findElement(By.xpath("(//a[text()='REGISTER'])[1]")).click();
		String w=dr.findElement(By.xpath("//img[contains(@src,'logo.gif')]")).getAttribute("width");
		String h=dr.findElement(By.xpath("//img[contains(@src,'logo.gif')]")).getAttribute("height");
		
		System.out.println(w);
		System.out.println(h);
	}

}
