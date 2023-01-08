package ch6.example11;

public class Person {
	// field
	final String nation = "Korea";
	final String ssn;
	String name;

	// constructor
	public Person(String ssn, String name) {
		this.ssn = ssn;
		this.name = name;
	}
}
