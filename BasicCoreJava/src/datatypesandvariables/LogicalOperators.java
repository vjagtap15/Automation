package datatypesandvariables;

public class LogicalOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=31;
		int b=20;
		int c=30;
		
		// && --- AND operator
		if(a>b && a>c)
		{
			System.out.println("A is greatest");
		}else {
			System.out.println("A is not greatest");
		}
		
		// || ---- OR operator
		if(a>b || a>c)
		{
			System.out.println("A is greater than either B or C");
		}else {
			System.out.println("A is smallest");
		}
	}

}
