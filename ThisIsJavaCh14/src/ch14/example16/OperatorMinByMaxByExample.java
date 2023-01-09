package ch14.example16;

import java.util.function.BinaryOperator;

public class OperatorMinByMaxByExample {
	public static void main(String[] args) {
		// field
		BinaryOperator<Fruit> binaryOperator;
		Fruit fruit;
		
		// minBy 메소드는 compare(f1,f2) 메소드가 - 값을 출력하면 f1 의 값을 출력.
		binaryOperator = BinaryOperator.minBy((f1, f2) -> Integer.compare(f1.price, f2.price));
		fruit = binaryOperator.apply(new Fruit("딸기", 6000), new Fruit("수박", 10000));
		System.out.println(fruit.name);

		// maxBy 메소드는 compare(f1,f2) 메소드가 + 값을 출력하면 f1 의 값을 출력.
		binaryOperator = BinaryOperator.maxBy((f1, f2) -> Integer.compare(f1.price, f2.price));
		fruit = binaryOperator.apply(new Fruit("딸기", 6000), new Fruit("수박", 10000));
		System.out.println(fruit.name);

	}
}
