package LogicTest;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Configuration.Config;
import Utilities.Xls_Reader;


public class dataproviderconcept {
	
	@Test(dataProvider="getdata2")
	public void loginTest(String Username, String Password)
	{
		System.out.println("Enter Username="+ Username);
		System.out.println("Enter Password="+ Password);
		System.out.println("Login Successfully");
		System.out.println("*****************");
	}

	@DataProvider
	public String[][] getdata() 
	{
		String[][] data = new String[3][2];

		// Row1
		data[0][0] = "User1";
		data[0][1] = "Password1";

		// Row2
		data[1][0] = "User2";
		data[1][1] = "Password2";

		// Row3
		data[2][0] = "User3";
		data[2][1] = "Password3";
		
		return data;

	}
	
	@DataProvider
	public String[][] getdata2() throws IOException 
	{
		Xls_Reader xl = new Xls_Reader(Config.testdata);
		int rows=xl.getrowcount("TestData");
		int cols=xl.getColumncount("TestData");
		
		String[][] data = new String [rows-1][cols];
		
		for (int r=2; r<=rows; r++)
		{
			for(int c=1; c<=cols; c++)
			{
				data[r-2][c-1]=xl.getCellData("TestData", r, c);
			}
		}
		return data;
	}


}
