package ch15.example.check8;

public class Student {
	private int studentNum;
	private String name;

	public Student(int studentNum, String name) {
		this.studentNum = studentNum;
		this.name = name;
	}

	public int getStudentNum() {
		return studentNum;
	}

	public String getName() {
		return name;
	}

	// 동일하다고 판단할 조건은 hashCode와 equals가 둘다 true 라고 판단할때.
	@Override
	public int hashCode() {
		return studentNum;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student student = (Student) obj;
			return ((name.equals(student.getName())) || studentNum == student.getStudentNum());
		} else {
			return false;
		}

	}
}