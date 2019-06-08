package functions;

public class Fun1 {
		
	public static void main(String[] args) 
	{
		int add=sum(10,20);
		int add2=sum(30,40);
		
		System.out.println(add);
		System.out.println(add2);
		System.out.println(add+add2);
	}
	
	public static int sum(int a, int b)
	{
		return a+b;
	//	System.out.println(a+b);

	}
}
