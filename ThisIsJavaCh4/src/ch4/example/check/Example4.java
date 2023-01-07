package ch4.example.check;

public class Example4 {

	public static void main(String[] args) {
		int result = 0;
		do {
		int num1 = (int) (Math.random() * 6) + 1;
		int num2 = (int) (Math.random() * 6) + 1;
		result = num1 + num2;
		System.out.println("두수의 합 : " + result);
	} while (result != 5);

	System.out.println("프로그램 종료 ");
	}

}
