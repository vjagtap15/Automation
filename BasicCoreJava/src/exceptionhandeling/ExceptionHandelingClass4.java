package exceptionhandeling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionHandelingClass4 {

	// throws should be used only with Checked exception throws only pass information to user 
	
	public static void main(String[] args) throws InterruptedException 
	{
		int a = 10;
		int b = 0;
		
		System.out.println(a/b); // UnChecked Exception - Arithmatic
		
		Thread.sleep(4000); // Checked Exception
		
		readData("");
		divide(a, b);
	}
	
	public static void readData(String filepath)
	{
		try {
			FileInputStream obj = new FileInputStream(filepath);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} // Checked Exception
	}

	public static void divide(int a, int b) throws ArithmeticException
	{
		System.out.println(a/b);
	}
	
	public static void readData2(String filepath) throws FileNotFoundException
	{
		FileInputStream obj = new FileInputStream(filepath);
	}
}
