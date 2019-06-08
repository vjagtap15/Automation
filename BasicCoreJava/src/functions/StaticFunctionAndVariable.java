package functions;

public class StaticFunctionAndVariable {

	public static void main(String[] args) 
	{
		int add=sum(10,20);
		int add2=sum(30,40);
		
		System.out.println(add);
		System.out.println(add2);
		System.out.println(add+add2);
		
		StaticFunctionAndVariable ref= new StaticFunctionAndVariable();
		
		ref.message("abc");
	}
	
	public static int sum(int a, int b)
	{
		return a+b;
	}
	
	public void message(String message)
	{
		System.out.println("Your message is "+message);
	}
}
