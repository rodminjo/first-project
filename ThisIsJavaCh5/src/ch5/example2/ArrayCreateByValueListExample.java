package ch5.example2;

public class ArrayCreateByValueListExample {

	public static void main(String[] args) {
		// 배열을 직접 합하는 방법
		int[] scores = { 83, 90, 87 };

		System.out.println("score [0] : " + scores[0]);
		System.out.println("score [1] : " + scores[1]);
		System.out.println("score [2] : " + scores[2]);

		int sum1 = 0;
		for (int i = 0; i < 3; i++) {
			sum1 += scores[i];
		}
		System.out.println("총합 : " + sum1);
		double avg = (double) sum1 / 3;
		System.out.println("평균 : " + avg);

		// 메소드를 생성하여 합하는 방법
		int sum2 = add(new int[] { 83, 90, 87 });
		System.out.println("총합 : " + sum2);
		System.out.println();

	}

	public static int add(int[] scores) {
		int sum = 0;
		for (int i = 0; i < 3; i++) {
			sum += scores[i];
		}
		return sum;
	}
}
