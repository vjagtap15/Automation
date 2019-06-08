package functions;

public class User {

	public static void main(String[] args) {
		
		Car car1 = new Car();
		car1.name="Vento";
		car1.colour="White";
		Car.wheels=5;
		car1.driving();

		Car car2 = new Car();
		car2.name="Polo";
		car2.colour="Silver";
		//car2.wheels=4;
		car2.driving();

		
	}

}
