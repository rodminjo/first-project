package ch6.example11;

public class PersonExample {

	public static void main(String[] args) {
		Person p1 = new Person("123456-1234567", "계백 ");

		System.out.println(p1.nation);
		System.out.println(p1.ssn);
		System.out.println(p1.name);

		// p1.nation = "usa"; //final 필드이기 때문에 값 수정할 수 없음.
		// p1.ssn = "654321 - 7654321";
		p1.name = "을지문덕";

	}

}
