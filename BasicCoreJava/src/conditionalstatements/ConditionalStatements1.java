package conditionalstatements;

public class ConditionalStatements1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=20;
		int c=30;
		
		if(a>b) 
		{
			System.out.println("a is greater than b");
		} else { 
			System.out.println("a is less than or equal to b");
		}
		
		
		//else if
		if(a>b)
		{
			System.out.println("a is greater than b");
		}
		else if(a>c)
		{
			System.out.println("a is greater than c");
		}
		else
		{
			System.out.println("a is smallest or equal to b");
		}
	}

}
