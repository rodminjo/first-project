package ch4.example.check;

public class Example3 {

	public static void main(String[] args) {
		int sum = 0;
		// 방법 1
		for (int i = 0; i <= 100; i += 3) {
			sum += i;
		}

		System.out.println("3의 배수의 합 : " + sum);

		// 방법 2
		int sum2 = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0) {
				sum2 += i;
			}
		}
		System.out.println(sum2);
		// 그외 continue를 if문 안에 넣어도 됨.
	}

}
