package ch8.example.check4;

public class OracleDao implements DateAccessObject {

	@Override
	public void select() {
		System.out.println("searching in oracle ");
	}

	@Override
	public void insert() {
		System.out.println("insert in oracle");
	}

	@Override
	public void update() {
		System.out.println("updating to oracle");
	}

	@Override
	public void delete() {
		System.out.println("delete in oracle");
	}

}
