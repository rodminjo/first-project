package ch14.example12;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {
	// field
	private static List<Student> list = Arrays.asList(new Student("hong", "man", 90), new Student("Kim", "woman", 90),
			new Student("Kam", "man", 95), new Student("Park", "woman", 92));

	public static double avg(Predicate<Student> predicate) {
		int count = 0, sum = 0;
		for (Student student : list) {
			if (predicate.test(student)) {
				count++;
				sum += student.getScore();
			}
		}
		return (double) sum / count;
	}

	public static void main(String[] args) {
		double maleAvg = avg(t -> t.getSex().equals("man"));
		System.out.println("남자 평균 점수 :" + maleAvg);

		double femaleAvg = avg(t -> t.getSex().equals("woman"));
		System.out.println("여자 평균 점수 :" + femaleAvg);

	}

}
