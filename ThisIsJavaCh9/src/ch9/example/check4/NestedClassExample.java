package ch9.example.check4;

public class NestedClassExample {

	public static void main(String[] args) {
		Car myCar = new Car();

		Car.Tire tire = myCar.new Tire();

		Car.Engine engine = new Car.Engine();

	}

}
