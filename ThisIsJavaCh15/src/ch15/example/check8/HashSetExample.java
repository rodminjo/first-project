package ch15.example.check8;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {
		Set<Student> set = new HashSet<Student>();

		set.add(new Student(1, "Hong"));
		set.add(new Student(2, "Shin"));
		set.add(new Student(1, "Jo"));
		System.out.println(new Student(1, "Hong").hashCode());
		System.out.println(new Student(1, "Jo").hashCode());
		Iterator<Student> iterator = set.iterator();
		while (iterator.hasNext()) {
			Student student = iterator.next();
			System.out.println(student.getStudentNum() + ":" + student.getName());
		}

	}

}
