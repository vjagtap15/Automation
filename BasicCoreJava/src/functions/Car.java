package functions;

public class Car {

	String name;   //Instance Variable
	String colour;
	static int wheels = 4;

	// Parameterized Constructor
	public Car(String name, String colour) 
	{
		this.name=name;
		this.colour=colour;
	}
	// If there are more than 1 constructor in a Class it is called as Overloaded Constructor
	// Default Constructor	
	public Car() 
	{
		
	}

	public void driving()
	{
		System.out.println("I am driving "+colour+" colour "+name+" car which has "+wheels+" wheels");
		
	}

}
