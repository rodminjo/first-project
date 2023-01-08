package ch5.example8;

public class AdvancedForExample {

	public static void main(String[] args) {
		int[] scores = { 95, 12, 71, 80, 87 };

		int sum = 0;
		for (int score : scores) {
			sum += score;
		}

		System.out.println("점수 총합 = " + sum);

		double avg = (double) sum / scores.length;
		System.out.println("평균 : " + avg);
	}

}
