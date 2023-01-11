package ch15.example5;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample2 {

	public static void main(String[] args) {
		Map<Student, Integer> map = new HashMap<>();

		map.put(new Student(1, "Hong"), 95);
		map.put(new Student(1, "Hong"), 95);

		System.out.println("total Entry :" + map.size());

	}

}
