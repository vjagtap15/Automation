package BasicSelenium;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.hssf.usermodel.*;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BookTicket3 {

	public static void main(String[] args) throws InterruptedException {

		try {
			FileInputStream file = new FileInputStream("C:\\SE_26052019\\Automation\\BasicCoreJava\\src\\excelfilehandeling\\BookTicket.xls");

			HSSFWorkbook wb = new HSSFWorkbook(file);
			HSSFSheet sheet = wb.getSheet("Ticket2");
			
			int r1 = 1;	
			
			HSSFRow row = sheet.getRow(r1);
			runTest(row.getCell(0).toString(), row.getCell(1).toString(), row.getCell(2).toString(), row.getCell(3).toString(),row.getCell(4).toString());
			wb.close();
			
		  } 
		catch (IOException e) 
		{ 
			System.out.println("Test data file not found");
		}
		 
	}

	public static void runTest(String p1fname, String p1lname,String p2fname, String p2lname,String CCNum) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\SE_26052019\\Drivers\\chromedriver.exe");

		ChromeDriver dr = new ChromeDriver();
		
		dr.manage().window().maximize();

		dr.get("http://www.newtours.demoaut.com/");

		dr.findElement(By.name("userName")).sendKeys("mercury");
		dr.findElement(By.name("password")).sendKeys("mercury");

		dr.findElement(By.name("login")).click();
		
		dr.findElement(By.xpath("//input[@value='oneway']")).click();

		Select sel = new Select(dr.findElement(By.xpath("//select[@name='passCount']")));
		sel.selectByValue("2");
		Thread.sleep(2000);
		dr.findElement(By.name("findFlights")).click();
		Thread.sleep(2000);
		dr.findElement(By.name("reserveFlights")).click();

		dr.findElement(By.name("passFirst0")).sendKeys(p1fname);
		dr.findElement(By.name("passLast0")).sendKeys(p1lname);
		dr.findElement(By.name("passFirst1")).sendKeys(p2fname);
		dr.findElement(By.name("passLast1")).sendKeys(p2lname);
		dr.findElement(By.name("creditnumber")).sendKeys(CCNum);

		Thread.sleep(2000);

		dr.findElement(By.name("buyFlights")).click();

		
		System.out.println(" Passenger Name: "+p1fname+" "+p1lname +", " +p2fname+" "+p2lname);
		System.out.println(dr.findElement(By.xpath("//font[contains(text(),'Confirmation #')]")).getText());
		System.out.println(" "+ dr.findElement(By.xpath("//font[contains(text(),'itinerary has been booked')]")).getText());
	}

}