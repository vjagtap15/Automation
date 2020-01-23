package BasicSelenium;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Program1 {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\SE_26052019\\Drivers\\chromedriver.exe");
		ChromeDriver dr = new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("http://www.newtours.demoaut.com/");
		dr.findElement(By.name("userName")).sendKeys("mercury");
		dr.findElement(By.name("password")).sendKeys("mercury");
		dr.findElement(By.name("login")).click();

		String path = System.getProperty("user.dir") + "\\src\\testdata\\TestData1.xls";
		FileInputStream file = new FileInputStream(path);

		HSSFWorkbook wb = new HSSFWorkbook(file);

		HSSFSheet sheet0 = wb.getSheet("PCount");
		HSSFSheet sheet1 = wb.getSheet("PName");
		HSSFSheet sheet2 = wb.getSheet("CCard");
		HSSFSheet sheet3 = wb.getSheet("Result");

		dr.findElement(By.xpath("//input[@value='oneway']")).click();

		Select sel = new Select(dr.findElement(By.xpath("//select[@name='passCount']")));

		// sel.selectByVisibleText("2");

		sel.selectByValue("1");

		String num = sel.getFirstSelectedOption().getAttribute("value");

		// System.out.println(num);

		HSSFCell cell = sheet0.getRow(1).getCell(0);

		if (cell == null)
			cell = sheet0.getRow(1).createCell(0);
		cell.setCellValue(num);

		FileOutputStream fileOut = new FileOutputStream(path);

		wb.write(fileOut);

		fileOut.close();

		String pnum= sheet0.getRow(1).getCell(0).getStringCellValue();

		//boolean pnum = sheet0.getRow(1).getCell(0).getBooleanCellValue();

		System.out.println(pnum);

		/*
		 * for (int r = 1; r <= pnum; r++) { for (int c = 0; c <= 1 + 1; c++) {
		 * System.out.println("Row num=" + r + " col num=" + c); } }
		 */ 

		/*
		 * dr.findElement(By.name("findFlights")).click();
		 * 
		 * dr.findElement(By.name("reserveFlights")).click();
		 * 
		 * String firstName=sheet1.getRow(1).getCell(0).getStringCellValue(); String
		 * lastname=sheet1.getRow(1).getCell(1).getStringCellValue(); String
		 * card=sheet2.getRow(1).getCell(0).getStringCellValue(); String
		 * expected=sheet3.getRow(1).getCell(0).getStringCellValue();
		 * 
		 * dr.findElement(By.name("passFirst0")).sendKeys(firstName);
		 * dr.findElement(By.name("passLast0")).sendKeys(lastname);
		 * dr.findElement(By.name("creditnumber")).sendKeys(card);
		 * 
		 * dr.findElement(By.name("buyFlights")).click();
		 * 
		 * String str=dr.findElement(By.
		 * xpath("//font[contains(text(),'itinerary has been booked!')]")).getText();
		 * 
		 * HSSFCell cell1=sheet3.getRow(1).getCell(1);
		 * 
		 * if(cell1==null) cell1=sheet3.getRow(1).createCell(1);
		 * cell1.setCellValue(str);
		 * 
		 * FileOutputStream fileOut = new FileOutputStream(path);
		 * 
		 * wb.write(fileOut);
		 * 
		 * fileOut.close();
		 * 
		 * if(str.equals(expected)) { System.out.println("Pass"); }else {
		 * System.out.println("Fail"); }
		 * 
		 * 
		 * System.out.println(str);
		 */

	}

}
