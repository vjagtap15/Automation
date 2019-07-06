package BasicSelenium;


import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LaunchBrowser {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\SE_26052019\\Drivers\\chromedriver.exe");

		/*
		 * OperaOptions op = new OperaOptions();
		 * 
		 * op.setBinary("C:\\Users\\DELL\\AppData\\Local\\Programs\\Opera\\launcher.exe"
		 * );
		 * 
		 * OperaDriver dr = new OperaDriver(op);
		 * 
		 * dr.get("http://www.newtours.demoaut.com/");
		 */
		
		ChromeDriver dr= new ChromeDriver();
		
		dr.manage().window().maximize();
		
		dr.get("http://www.newtours.demoaut.com/");
		
		dr.findElement(By.name("userName")).sendKeys("mercury");
		dr.findElement(By.name("password")).sendKeys("mercury");
		dr.findElement(By.name("login")).click();
		
		dr.findElement(By.xpath("//input[@value='oneway']")).click(); // Two types of xpath - 1: Absolute -- Starts from Start of HTML tag
		
		Select sel = new Select(dr.findElement(By.xpath("//select[@name='passCount']"))); // 2: Relative (//tagname[@AttributeName = Att.value']
		sel.selectByIndex(2);
		Thread.sleep(2000);
		sel.selectByValue("1");
		Thread.sleep(2000);
		sel.selectByVisibleText("4");
		
		//dr.findElement(By.ByXPath("//font[contains(text(),'itinerary has been booked')]")).getText();
		
	}

}
