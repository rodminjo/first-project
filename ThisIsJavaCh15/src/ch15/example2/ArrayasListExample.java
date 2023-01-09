package ch15.example2;

import java.util.List;

public class ArrayasListExample {

	public static void main(String[] args) {
		List<String> list1 = List.of("홍길동", "신용권", "김자바");

		for (String str : list1) {
			System.out.println(str);
		}

		List<Integer> list2 = List.of(1, 2, 3);

		for (int value : list2) {
			System.out.println(value);
		}

	}

}
