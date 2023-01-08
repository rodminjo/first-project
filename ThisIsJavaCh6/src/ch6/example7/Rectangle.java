package ch6.example7;

public class Rectangle {

	public double areaRectangle(int i) {
		return this.areaRectangle((double) i, (double) i);

	}

	public double areaRectangle(int i, int i2) {
		return this.areaRectangle((double) i, (double) i2);
	}

	public double areaRectangle(double i, double i2) {
		return i * i2;
	}
}
