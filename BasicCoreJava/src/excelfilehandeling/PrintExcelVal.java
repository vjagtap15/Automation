package excelfilehandeling;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.hssf.usermodel.*; // * used to access all package

public class PrintExcelVal {

	public static void main(String[] args) throws IOException {
		
		FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\src\\excelfilehandeling\\BookTicket.xls");
		
		HSSFWorkbook wb = new HSSFWorkbook(file);
		HSSFSheet sheet = wb.getSheet("Ticket2");
		HSSFRow row = sheet.getRow(1);
		HSSFCell cell0 = row.getCell(0);
		System.out.println(cell0);
		HSSFCell cell1 = row.getCell(1);
		System.out.println(cell1);
		HSSFCell cell2 = row.getCell(2);
		System.out.println(cell2);
		
		
		/*
		 * String val = cell.getStringCellValue();
		 * 
		 * int rows=sheet.getLastRowNum(); int cols=row.getLastCellNum();
		 * 
		 * 
		 * 
		 * for(int r=1; r<=rows; r++) { for(int c=0; c<cols; c++) { String val1 =
		 * sheet.getRow(r).getCell(c).getStringCellValue(); System.out.print(val1 +
		 * " "); } System.out.println(); }
		 */
		
	}

}