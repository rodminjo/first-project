package ch16.example1;

import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class IteratorVsStreamExample {

	public static void main(String[] args) {
		List<String> list = List.of("Hong", "Shin", "Kam");

		Iterator<String> iterator = list.iterator();
		while (iterator.hasNext()) {
			String name = iterator.next();
			System.out.println(name);
		}
		System.out.println();

		// 스트림 사용
		Stream<String> stream = list.stream();
		stream.forEach(m -> System.out.println(m));
	}

}
