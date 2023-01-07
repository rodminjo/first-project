package ch3.example7;

public class InfinityAndNaNCheckExample {

	public static void main(String[] args) {
		int x = 5;
		double y = 0.0;

		// double z = x / y; //0으로 나누면 infinite 발생
		double z = x % y; // 0으로 나눈 나머지는 Not a Number 오류 발생

		System.out.println(Double.isInfinite(z));
		System.out.println(Double.isNaN(z));

		System.out.println(z + 2);
	}

}
