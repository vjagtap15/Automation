package datatypesandvariables;

import functions.AccessModifier;

public class TestAccessModAtProjectLevel extends AccessModifier {

	public static void main(String[] args) {
		
		AccessModifier obj= new AccessModifier();
		obj.publicMethod();
		
		TestAccessModAtProjectLevel obj1= new TestAccessModAtProjectLevel();
		obj1.protectedMethod();
		
		
		
	}

}
