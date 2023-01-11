package ch15.example.check10;

public class Student implements Comparable {
	public String id;
	public int score;

	public Student(Sting id, int score) {
		this.id = id;
		this.score = score;

	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

}

//last()메소드를 호출했을때 가장높은 score의 student 객체가 리턴되도록 작