package ch14.example14;

import java.util.function.IntPredicate;

public class PredicateAndOrNegateExample {
	public static void main(String[] args) {
		// 2의 배수 검사.
		IntPredicate predicateA = a -> a % 2 == 0;

		// 3의 배수 검사.
		IntPredicate predicateB = a -> a % 3 == 0;

		IntPredicate predicateAB;
		boolean result;

		// and()
		predicateAB = predicateA.and(predicateB);
		System.out.println("9는 2와 3의 배수입니까 ? : " + predicateAB.test(9));

		// or()
		predicateAB = predicateA.or(predicateB);
		System.out.println("9는 2 또는 3의 배수입니까 ? : " + predicateAB.test(9));
		
		//negate()
		predicateAB = predicateA.negate();
		System.out.println("9는 홀수입니까 ? : " + predicateAB.test(9));
		

	}

}
