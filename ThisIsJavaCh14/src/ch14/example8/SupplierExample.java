package ch14.example8;

import java.util.function.IntSupplier;

public class SupplierExample {

	public static void main(String[] args) {
		// Supplier 입력값이 없고 출력값만 있음.
		IntSupplier intSupplier = () -> {
			int sum = (int) (Math.random() * 6) + 1;
			return sum;
		};
		System.out.println("주사위 눈의 수 : " + intSupplier.getAsInt());

	}

}
