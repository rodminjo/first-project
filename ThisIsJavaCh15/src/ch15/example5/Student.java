package ch15.example5;

public class Student {
	public int sno;
	public String name;
	public String score;

    public Student(Integer sno, String name) {
		this.sno = sno;
		this.name = name;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Student) {
			Student student = (Student) obj;
			return (student.name == this.name) && (student.sno == this.sno);

		} else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return sno + name.hashCode();
	}
}
