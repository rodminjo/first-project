package ch14.example13;

public class Member {

	// field
	private String name;
	private String id;
	private Address address;

	// constructor
	public Member(String name, String id, Address address) {
		this.name = name;
		this.id = id;
		this.address = address;
	}

	// method
	public String getName() {
		return name;
	}

	public String getId() {
		return id;
	}

	public Address getAddress() {
		return address;
	}

}
