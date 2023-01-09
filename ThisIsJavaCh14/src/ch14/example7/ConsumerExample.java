package ch14.example7;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.ObjIntConsumer;

public class ConsumerExample {

	public static void main(String[] args) {
		// 객체 하나를 받아 소비.
		// accept는 Consumer의 단한개 추상메소드로 추후 stream의 forEach문에 사용.
		Consumer<String> consumer = t -> System.out.println(t + "8");
		consumer.accept("java");
		// 객체 두개를 받아 소비.
		BiConsumer<String, String> bigConsumer = (t, u) -> System.out.println(t + u);
		bigConsumer.accept("Java", "11");
		// 더블값 하나를 받아 소비.
		DoubleConsumer doubleConsummer = d -> System.out.println("Java" + d);
		doubleConsummer.accept(17.0);
		// 객체 하나와 인트값 받아 소비.
		ObjIntConsumer<String> objIntConsumer = (o, i) -> System.out.println(o + i);
		objIntConsumer.accept("Java", 17);
	}

}
