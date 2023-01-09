package ch14.example13;

import java.util.function.Consumer;

public class ConsumerAndThenExample {

	public static void main(String[] args) {
		Consumer<Member> consumerA = m -> {
			System.out.println("consumerA : " + m.getName());
		};

		Consumer<Member> consumerB = m -> {
			System.out.println("consumerB : " + m.getId());
		};
		// consumerA 를 먼저 해결한 후 그 출력값을 consumerB로 보내서 처리.
		Consumer<Member> consumerAB = consumerA.andThen(consumerB);
		consumerAB.accept(new Member("hong gil dong", "hong", null));

	}
}
