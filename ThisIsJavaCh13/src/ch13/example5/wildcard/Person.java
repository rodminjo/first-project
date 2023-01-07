package ch13.example5.wildcard;

public class Person {
	String name;

	Person(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return this.name;
	}
}

class Worker extends Person {

	Worker(String str) {
		super(str);
	}

}

class Student extends Person {

	Student(String str) {
		super(str);
	}

}

class HighStudent extends Student {

	HighStudent(String str) {
		super(str);
	}

}