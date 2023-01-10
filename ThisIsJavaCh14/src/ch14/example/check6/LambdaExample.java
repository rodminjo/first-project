package ch14.example.check6;

import java.util.function.Function;

// **** 어려웠음. 여러번 확인하기.
public class LambdaExample {
	private static Student[] students = { new Student("Hong", 90, 96), new Student("Shin", 95, 93) };

	// avg 메소드 작성
	static double avg(Function<Student, Integer> function) {
		int sum = 0;
		double average;
		for (Student stu : students) {
			sum += function.apply(stu);
		}
		
		average = (double) sum / students.length;
		
		return average;
	}

	public static void main(String[] args) {
//		double englishAvg = avg(s -> s.getEnglishScore());
//		System.out.println("English average score : " + englishAvg);
//
//		double mathAvg = avg(s -> s.getMathScore());
//		System.out.println("math average score : " + mathAvg);

		// 메소드 참조
		double englishAvg = avg(Student::getEnglishScore);
		System.out.println("English average score : " + englishAvg);

		double mathAvg = avg(Student::getMathScore);
		System.out.println("math average score : " + mathAvg);

	}

	public static class Student {
		// field
		private String name;
		private int englishScore;
		private int mathScore;

		// constructor
		public Student(String name, int englishScore, int mathScore) {
			this.name = name;
			this.englishScore = englishScore;
			this.mathScore = mathScore;
		}

		// method
		public int getEnglishScore() {
			return englishScore;
		}

		public String getName() {
			return name;
		}

		public int getMathScore() {
			return mathScore;
		}

	}

}
