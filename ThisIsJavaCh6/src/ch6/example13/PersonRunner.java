package ch6.example13;

public class PersonRunner {

	public static void main(String[] args) {
		Person person = new Person("조경민", 26, 170, 66);
		person.show();
		person.setWeight(70);
		System.out.println(person.getHeight());
		System.out.println(person.getWeight());

	}

}
