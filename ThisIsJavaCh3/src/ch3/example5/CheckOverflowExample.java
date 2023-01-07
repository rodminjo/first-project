package ch3.example5;

public class CheckOverflowExample {

	public static void main(String[] args) {
		// try - catch 문은 예외처리 코
		try {
			int result = safeAdd(2000000000, 2000000000);
		} catch (ArithmeticException e) {
			System.out.println("overflow!!");
		}
	}

	private static int safeAdd(int left, int right) {
		if (right > 0) {
			if (left > Integer.MAX_VALUE - right) {
				throw new ArithmeticException("오버플로우 발생!"); // 예외를 발생시킴
			}
		}
		return left + right;
	}

}
