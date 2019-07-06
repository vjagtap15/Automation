package BasicSelenium;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.*;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BookTicket1 {

	public static void main(String[] args) throws InterruptedException {

		try 
		{
			String path = "C:\\SE_26052019\\Automation\\BasicCoreJava\\src\\excelfilehandeling\\BookTicket.xls";
			FileInputStream file = new FileInputStream(path);
			HSSFWorkbook wb = new HSSFWorkbook(file);
			HSSFSheet sheet = wb.getSheet("Ticket1");

			int count = 1;

			HSSFRow row = sheet.getRow(count);
			runTest(row.getCell(0).toString(), row.getCell(1).toString(), row.getCell(2).toString());
			wb.close();

		} catch (IOException e) {
			System.out.println("Test data file not found");
		}

	}

	public static void runTest(String fname, String lname, String CCNum) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\SE_26052019\\Drivers\\chromedriver.exe");

		ChromeDriver dr = new ChromeDriver();

		dr.manage().window().maximize();

		dr.get("http://www.newtours.demoaut.com/");

		dr.findElement(By.name("userName")).sendKeys("mercury");
		dr.findElement(By.name("password")).sendKeys("mercury");

		dr.findElement(By.name("login")).click();

		dr.findElement(By.xpath("//input[@value='oneway']")).click();

		Select sel = new Select(dr.findElement(By.xpath("//select[@name='passCount']")));
		sel.selectByValue("1");
		Thread.sleep(2000);
		dr.findElement(By.name("findFlights")).click();
		Thread.sleep(2000);
		dr.findElement(By.name("reserveFlights")).click();

		dr.findElement(By.name("passFirst0")).sendKeys(fname);
		dr.findElement(By.name("passLast0")).sendKeys(lname);
		dr.findElement(By.name("creditnumber")).sendKeys(CCNum);

		Thread.sleep(2000);

		dr.findElement(By.name("buyFlights")).click();

		System.out.println(dr.findElement(By.xpath("//font[contains(text(),'itinerary has been booked')]")).getText());

		String r1 = dr.findElement(By.xpath("//font[contains(text(),'itinerary has been booked')]")).getText();
		
		String path = "C:\\SE_26052019\\Automation\\BasicCoreJava\\src\\excelfilehandeling\\BookTicket.xls";
		FileInputStream file = new FileInputStream(path);
		
		HSSFWorkbook wb1 = new HSSFWorkbook(file);

		HSSFSheet sheet = wb1.getSheet("Ticket1");

		HSSFRow row = sheet.getRow(1);

		HSSFCell cell = row.getCell(4);

		cell.setCellValue(r1);

		//System.out.println(cell);

		FileOutputStream fileOut = new FileOutputStream(path);

		wb1.write(fileOut);

		fileOut.close();

		wb1.close();

		// System.out.println(" Passenger Name: "+fname+" "+lname);
		// System.out.println(dr.findElement(By.xpath("//font[contains(text(),'Confirmation
		// #')]")).getText());
		// System.out.println(" "+
		// dr.findElement(By.xpath("//font[contains(text(),'itinerary has been
		// booked')]")).getText());
	}

}