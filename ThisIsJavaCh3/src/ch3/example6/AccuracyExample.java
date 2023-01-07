package ch3.example6;

public class AccuracyExample {

	public static void main(String[] args) {
		int apple = 1;
		double pieceUnit = 0.1;
		int number = 7;

		double result = apple - number * pieceUnit;
		// 정확한 값이 안나옴. 정확한 값은 정수연산으로 .
		System.out.println("사과 한개에서 \n0.7조각을 빼면\n" + result + "조각이 남는다.");
	}

}
