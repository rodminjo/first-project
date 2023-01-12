package ch15.example.check10;

public class Student implements Comparable<Student> {
	public String id;
	public int score;

	public Student(String id, int score) {
		this.id = id;
		this.score = score;

	}

	@Override
	public int compareTo(Student obj) {
		return Integer.compare(this.score, (obj.score));
	}

}

//last()메소드를 호출했을때 가장높은 score의 student 객체가 리턴되도록 작