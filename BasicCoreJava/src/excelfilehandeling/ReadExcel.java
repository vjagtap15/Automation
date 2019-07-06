package excelfilehandeling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

//import org.apache.poi.hssf.usermodel.HSSFCell;
//import org.apache.poi.hssf.usermodel.HSSFRow;
//import org.apache.poi.hssf.usermodel.HSSFSheet;
//import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import org.apache.poi.hssf.usermodel.*; // * used to access all package

public class ReadExcel {

	public static void main(String[] args) throws IOException {
		
		FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\src\\excelfilehandeling\\TestData.xls");
		
		//System.out.println(System.getProperty("user.dir")); // Command to get project path
		
		HSSFWorkbook wb = new HSSFWorkbook(file);
		HSSFSheet sheet = wb.getSheet("Sheet1");
		HSSFRow row = sheet.getRow(1);
		HSSFCell cell = row.getCell(0);
		String val = cell.getStringCellValue();
		
		int rows=sheet.getLastRowNum();
		int cols=row.getLastCellNum();
		
		System.out.println(rows);
		System.out.println(cols);	
				
		for(int r=1; r<=rows; r++)
		{
			for(int c=0; c<cols; c++)
			{
				String val1 = sheet.getRow(r).getCell(c).getStringCellValue();
				
				System.out.print(val1 + " ");
			}
		System.out.println();
		}
		
	}

}
