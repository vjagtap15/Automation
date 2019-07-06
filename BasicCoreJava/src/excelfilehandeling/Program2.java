package excelfilehandeling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class Program2 {

	public static void main(String[] args) throws IOException 
	{
		String path=System.getProperty("user.dir") + "\\src\\excelfilehandeling\\BookTicket.xls";
FileInputStream file= new FileInputStream(path);
		
		HSSFWorkbook wb= new HSSFWorkbook(file);
		
		HSSFSheet sheet=wb.getSheet("Sheet1");
				
		HSSFRow row=sheet.getRow(1);		
		
		HSSFCell cell=row.getCell(0);
		
		String val=cell.getStringCellValue();
		
		
		int rows=sheet.getLastRowNum();	
		int cols=row.getLastCellNum();
		
		System.out.println(rows);
		System.out.println(cols);
		
		/*
		 * String[][] data=new String[rows+1][cols];
		 * 
		 * for(int r=0; r<=rows; r++) { for(int c=0; c<cols; c++) { String
		 * val1=sheet.getRow(r).getCell(c).getStringCellValue();
		 * 
		 * data[r][c]=val1; } } System.out.println(r,c);
		 * 
		 * 
		 * 
		 * //Copy data
		 * 
		 * HSSFSheet sheet2 = wb.createSheet("Sheet3"); for(int r=0; r<data.length; r++)
		 * { row = sheet2.getRow(r); if (row == null) row = sheet2.createRow(r); for(int
		 * c=0; c<data[0].length; c++) { cell = row.getCell(c); if (cell == null) cell =
		 * row.createCell(c); cell.setCellValue(data[r][c]); } } FileOutputStream
		 * fileOut = new FileOutputStream(path); wb.write(fileOut); fileOut.close();
		 */
		

	}

}