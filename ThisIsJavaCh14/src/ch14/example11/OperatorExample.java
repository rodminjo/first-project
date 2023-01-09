package ch14.example11;

import java.util.function.IntBinaryOperator;

public class OperatorExample {

	private static int[] scores = { 92, 95, 87 };

	public static int maxOrMin(IntBinaryOperator operator) {
		int result = scores[0];
		for (int score : scores) {
			result = operator.applyAsInt(result, score);
			}
		return result;
		}
		
		
		
	public static void main(String[] args) {
		int max = maxOrMin(
				(s, e) -> {
					if (Integer.compare(s, e) >= 0) {
						return s;
					} else {
						return e;
					}
				});
		System.out.println("최대값 : " + max);

		int min = maxOrMin((s, e) -> {
			if (Integer.compare(s, e) <= 0) {
				return s;
			} else {
				return e;
			}
		});
		System.out.println("최소값 : " + min);
	}

}
