package ch14.example.check4;

import java.util.function.IntSupplier;

public class LamdaExample {

		public static int method(int x, int y) {
			IntSupplier supplier = () -> {
				// x += 10; // 메소드 안 인터페이스는 로컬변수와 매개변수가 final 의 특성을 가짐.
				int result = x + y;
				return result;
			};
			int result = supplier.getAsInt();
			return result;
		}

	public static void main(String[] args) {
		System.out.println(method(3, 5));

	}
}

