package ch6.example7;

public class RectangleRunner {

	public static void main(String[] args) {
		Rectangle myCalcu = new Rectangle();

		double result1 = myCalcu.areaRectangle(10);

		double result2 = myCalcu.areaRectangle(10, 20);

		double result3 = myCalcu.areaRectangle(10.5, 20.0);

		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);

	}

}
