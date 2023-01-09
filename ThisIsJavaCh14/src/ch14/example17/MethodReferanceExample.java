package ch14.example17;

import java.util.function.IntBinaryOperator;

public class MethodReferanceExample {

	public static void main(String[] args) {
		IntBinaryOperator operator;

		// static method referance
		operator = (x, y) -> Calculator.staticMethod(x, y);
		System.out.println("결과1 : " + operator.applyAsInt(1, 2));

		operator = Calculator::staticMethod;
		System.out.println("결과2 : " + operator.applyAsInt(1, 2));

		// instance method referance

		operator = (x, y) -> new Calculator().instanceMethod(x, y);
		System.out.println("결과3 : " + operator.applyAsInt(1, 2));
		
		Calculator obj = new Calculator();
		// 방법 1.
		operator = new Calculator()::instanceMethod;
		// 방법 2.
		operator = obj::instanceMethod;
		System.out.println("결과4 : " + operator.applyAsInt(1, 2));
	}

}
