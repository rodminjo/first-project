package ch8.example3;

public class VehicleRunner {

	public static void main(String[] args) {
		Vehicle bus = new Bus();
		Driver driver = new Driver();

		driver.drive(bus);
	}

}
