package locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HAndelWebTable {
	
	public static void main(String[] args)
	{
		Library lib= new Library();
		
		//Launch Browser
		WebDriver dr=lib.launchBrowser();
		
		List <WebElement> Rowslist=dr.findElements(By.xpath("//table[@border='2']/tbody/tr"));
		
		for(WebElement e:Rowslist)
		{
			List<WebElement> cols = e.findElements(By.tagName("td"));
			
			for(WebElement c:cols)
			{
				System.out.println(c.getText());
			}
		}
	}

}
