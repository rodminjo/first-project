package ch14.example15;

import java.util.function.Predicate;

public class PredicateIsEqualExample {

	public static void main(String[] args) {
		Predicate<String> predicate;

		predicate = Predicate.isEqual(null);
		System.out.println("null,null : " + predicate.test(null));

		predicate = Predicate.isEqual("Java8");
		System.out.println("null,Java8 : " + predicate.test(null));

		predicate = Predicate.isEqual("Java8");
		System.out.println("java8,Java8 : " + predicate.test("Java8"));

		predicate = Predicate.isEqual(null);
		System.out.println("java8,null : " + predicate.test("Java8"));

		predicate = Predicate.isEqual("Java 17");
		System.out.println("java 8,Java 17 : " + predicate.test("Java 8"));

	}

}
