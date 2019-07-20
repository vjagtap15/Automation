package BasicSelenium;

import java.io.IOException;

public class ReadExcelData {

	public static void main(String[] args) throws IOException 
	{
		Xls_Reader xl = new Xls_Reader("C:\\SE_26052019\\Automation\\Selenium\\src\\TestData\\TestData.xls");

		int rows=xl.getrowcount("Sheet1");
		int cols=xl.getColumncount("Sheet1");
		
		System.out.println(rows);
		System.out.println(cols);
		
		String str=xl.getCellData("Sheet1", 1, 1);
		
		System.out.println(str);
		
		String str2 = xl.getCellData("Sheet1", 2, "Surname");
		
		System.out.println(str2);
		
		xl.setCellData("Sheet1", "Surname", 3, "Shinde");
		
	}

}
