package oopsinheritence;

public class Mobile extends Telephone
{
	public void texting()
	{
		System.out.println("Texting from Mobile Phone");
		
	}
	
	// method overriding two classes with same method name it also called as dynamic/runtime polymorphysm
	public void calling() 
	{
		System.out.println("Calling from Mobile"); 
		
	}
}
