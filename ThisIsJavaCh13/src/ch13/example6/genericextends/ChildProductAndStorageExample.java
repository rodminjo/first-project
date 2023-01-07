package ch13.example6.genericextends;

public class ChildProductAndStorageExample {

	public static void main(String[] args) {
		ChildProduct<Tv, String, String> product = new ChildProduct<>();
		product.setKind(new Tv());
		product.setModel("SmartTV");
		product.setCompany("Samsung"); // Tv, SmartTV, Samsung 정보 입력.

		Storage<Tv> storage = new StorageImple<Tv>(10);
		storage.add(new Tv(), 0);
		Tv tv = storage.get(0);

		System.out.println(product);
		System.out.println(storage);

	}

}
