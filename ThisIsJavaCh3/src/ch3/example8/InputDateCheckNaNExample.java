package ch3.example8;

public class InputDateCheckNaNExample {

	public static void main(String[] args) {
		// NaN은 연산이 가능함. 값이 망가지지 않도록 조심
		String userInput = "NaN";
		double val = Double.valueOf(userInput);

		double currentBalance = 10000.0;

		// 오류 필터 코드
		if (Double.isNaN(val)) {
			System.out.println("오류로 실행할 수 없음.");
			val = 0.0;
		}
		currentBalance += val;

		System.out.println(currentBalance);
	}

}
