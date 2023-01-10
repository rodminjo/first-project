package ch14.example.check5;

import java.util.function.IntBinaryOperator;

public class LambdaExample {
	// feild
	private static int[] scores = { 10, 50, 3 };

	// static method
	public static int maxOrMin(IntBinaryOperator operator) {
		int result = scores[0];
		for (int score : scores) {
			result = operator.applyAsInt(result, score);
		}
		return result;
	}

	// main method
	public static void main(String[] args) {
		// 최대값 얻기
		int max = maxOrMin(new IntBinaryOperator() {

			@Override
			public int applyAsInt(int left, int right) {
				int compareResult = Integer.compare(left, right);
				if (compareResult >= 0) {
					return left;
				} else {
					return right;
				}
			}
		});
		System.out.println("최대값 : " + max);
		// 최소값 구하기
		int min = maxOrMin(new IntBinaryOperator() {

			@Override
			public int applyAsInt(int left, int right) {
				int compareResult = Integer.compare(right, left);
				if (compareResult >= 0) {
					return left;
				} else {
					return right;
				}
			}
		});
		System.out.println("최소값 : " + min);
	}

}
