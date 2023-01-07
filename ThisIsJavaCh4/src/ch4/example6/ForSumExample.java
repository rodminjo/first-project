package ch4.example6;

public class ForSumExample {

	public static void main(String[] args) {
		int sum = 0;
		for (int i = 0; i <= 100; i++) {
			sum += i;
		}
		System.out.println(sum);

		// 부동 소숫점 타입은 실제보다 약간 큰 값을 표현함. 실제랑 다름. 사용하지 말것.
		for (float x = 0.1f; x <= 1.0f; x += 0.1f) {
			System.out.println(x);
		}

	}

}
