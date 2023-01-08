package ch8.example.check4;

public class MySqlDao implements DateAccessObject {

	@Override
	public void select() {
		System.out.println("searching in mysql ");

	}

	@Override
	public void insert() {
		System.out.println("inserting in mysql ");

	}

	@Override
	public void update() {
		System.out.println("updating in mysql ");

	}

	@Override
	public void delete() {
		System.out.println("deleting in mysql ");

	}

}
