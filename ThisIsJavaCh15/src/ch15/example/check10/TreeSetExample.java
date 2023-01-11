package ch15.example.check10;

import java.util.TreeSet;

import ch15.example5.Student;

public class TreeSetExample {

	public statiTreeSet<E> main(String[] args) {
		TreeSet<Student> treeSet = new TreeSet<Student>();
		treeSet.add("blue", 96);
		treeSet.add("hong", 86);
		treeSet.add("white", 92);

		Student student = treeSet.last();
		System.out.println("최고점수 : " + student.score);
		System.out.println("최고점수를 받은 아이디: " + student.id);

	}

}
