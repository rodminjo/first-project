package ch16.example2;

import java.util.List;
import java.util.stream.Stream;

public class LambdaExpressionsExample {

	public static void main(String[] args) {
		List<Student> list = List.of(new Student("Hong", 90), new Student("Shin", 92));
		
		Stream<Student> stream = list.stream();
		stream.forEach(m -> System.out.println("이름 : " + m.getName() + "  점수 : " + m.getScore()));
	}

}
