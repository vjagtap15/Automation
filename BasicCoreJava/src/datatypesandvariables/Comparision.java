package datatypesandvariables;

public class Comparision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=20;
		int b=20;
		
		// <, >, ==, <=, >=, != - Relational operators
		
		//>
		if(a>b)
		{
			System.out.println("A is greater than B");
		}else {
			System.out.println("A is equal to B");
		}
		
		//<
		if(a<b)
		{
			System.out.println("A is less than B");
		}else {
			System.out.println("A is equal to B");
		}
		
		//>=
		if(a>=b)
		{
			System.out.println("A is greater than or equal to B");
		}else {
			System.out.println("B is greater than or equal to A");
		}
		
		//<=
		if(a<=b)
		{
			System.out.println("A is less than or equal to B");
		}else {
			System.out.println("B is less than or equal to A");
		}
		
		//== operator
		if(a==b)
		{
			System.out.println("A is equal to B");
		}else {
			System.out.println("B is not equal to A");
		}
		
		//!=
		if(a!=b)
		{
			System.out.println("A is not equal B");
		}else {
			System.out.println("B is equal to A");
		}
		
	}

}
