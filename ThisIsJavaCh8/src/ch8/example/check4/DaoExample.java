package ch8.example.check4;

public class DaoExample {
	public static void dbWork(DateAccessObject dao) {
		dao.select();
		dao.insert();
		dao.update();
		dao.delete();
	}

	public static void main(String[] args) {
		dbWork(new OracleDao());
		dbWork(new MySqlDao());

	}

}
