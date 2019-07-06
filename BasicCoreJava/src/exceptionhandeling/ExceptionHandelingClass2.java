package exceptionhandeling;

public class ExceptionHandelingClass2 {

	public static void main(String[] args) {

		ExceptionHandelingClass2 obj = new ExceptionHandelingClass2();

		try {
			// Step 1
			obj.test(10, 10);
		} catch (Exception e) {
			System.out.println("Fail: " + e.getMessage());
		}
		// Step 2

		System.out.println("Print Statement");

	}

	public int test(int a, int b) {
		return a / b;
	}

}
