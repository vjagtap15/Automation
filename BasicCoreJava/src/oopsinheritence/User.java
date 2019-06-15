package oopsinheritence;

public class User {

	public static void main(String[] args)
	{
		SmartPhone phone= new SmartPhone(); // 
		
		phone.internet(); // inheritence of class
		phone.texting();
		phone.calling();

		Telephone obj= new Telephone();
		
		
		//
		long a = 423423434;
		
		Telephone tel= new Telephone();
		tel=new Mobile();
		tel=new SmartPhone();
		
	}

}
