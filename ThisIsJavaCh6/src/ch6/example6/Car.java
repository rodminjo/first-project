package ch6.example6;

public class Car {
	// field
	int speed;

	// constructor

	// method
	int getSpeed() {
		return speed;
	}

	void keyTurnOn() {
		System.out.println("키를 돌립니다.");
	}

	void run() {
		for (int i = 10; i <= 50; i += 10) {
			speed = i;
			System.out.println("시속 : " + speed + "km/h");
		}
	}
}
