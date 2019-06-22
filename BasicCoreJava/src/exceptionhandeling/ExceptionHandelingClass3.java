package exceptionhandeling;

import oopsabstraction.RBI;

public class ExceptionHandelingClass3 {

	public static void main(String[] args) throws InterruptedException {

		try {
			// Exception Type 1: Unchecked Exception

			int a = 10;
			int b = 10;
			System.out.println(a / b);

			RBI obj = null;
			//obj.CreditCard();

			String str = "Anand";
			System.out.println(str.charAt(5));

			System.out.println("anand");

			// Exception Type 2 : Checked Exception
			Thread.sleep(3000);

			System.out.println("bhayre");
			Test.login();
		}
		
		/*
		 * catch (ArithmeticException e) { System.out.println("Divident is Zero"); }
		 * 
		 * catch(NullPointerException e) {
		 * System.out.println("RBI Reference is not intialized"); }
		 * 
		 */
		catch(RuntimeException e)
		{
			System.out.println(e.getMessage());
		}
			
		System.out.println("Step 2");
	}

}
