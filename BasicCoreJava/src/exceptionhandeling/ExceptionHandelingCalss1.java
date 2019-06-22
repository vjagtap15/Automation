package exceptionhandeling;

import oopsabstraction.RBI;

public class ExceptionHandelingCalss1 {

	public static void main(String[] args) throws InterruptedException {

		// Exception Types
		/*
		 * 1 Checked a: Intrupted b: IO c: FileNotFound d: SQL e: etc
		 * 
		 * 2 UnChecked a: RunTime b: Arithmatic c: StringOutOfBound d: ArrayOutOfBound
		 * e: NullPointer f: etc
		 */

		int a = 10;
		int b = 0;
		System.out.println(a / b);

		RBI obj=null;
		obj.CreditCard();

		String str = "Anand";
		System.out.println(str.charAt(5));

		System.out.println("anand");

		Thread.sleep(3000);

		System.out.println("bhayre");
		Test.login();
	}

}
