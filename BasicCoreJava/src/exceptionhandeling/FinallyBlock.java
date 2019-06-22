package exceptionhandeling;

public class FinallyBlock
{

	public static void main(String[] args)
	{
		// Excecute Try and Catch both
		
		try {
			int a = 10;
			int b = 10;
			System.out.println(a/b);
			System.out.println("Testing");
			
			
		}catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
		finally {
			
			System.out.println("Executing finally block");
		}
		
	}
	
}
