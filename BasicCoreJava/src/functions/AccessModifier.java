package functions;

public class AccessModifier {

	public static void main(String[] args)
	{
		AccessModifier obj= new AccessModifier();
		obj.publicMethod();
		obj.privateMethod();
		obj.NoAccessMethod();
		obj.protectedMethod();
		
	}

	//Public access throughout the project
	
	public void publicMethod()
	{
		System.out.println("Public Mathod");
		
	}
	
	
	//Private access within the Class
	private void privateMethod()
	{
		System.out.println("Private Method");
		
	}
	
	// No Access Modifier within the Class and Package
	
	void NoAccessMethod()
	{
		
		System.out.println("No Access Method");
	}
	
	
	// Protected with the Class and Package by using child class object 

	protected void protectedMethod()
	{
		System.out.println("Protected Method");
		
	}
	

}
