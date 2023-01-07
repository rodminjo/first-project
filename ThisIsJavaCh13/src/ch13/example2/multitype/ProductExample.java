package ch13.example2.multitype;

public class ProductExample {

	public static void main(String[] args) {
		Product<Tv, String> product1 = new Product<>();
		product1.setKind(new Tv());
		product1.setModel("스마트 Tv");
		Tv tv = product1.getKind();
		String tvModel = product1.getModel();
		System.out.println(tvModel);

		Product<Car, String> product2 = new Product<>();
		product2.setKind(new Car());
		product2.setModel("디젤");
		Car car = product2.getKind();
		String carModel = product2.getModel();
		System.out.println(carModel);

	}

}

// Tv 객체 생성을 위한 클래스 선언 .
class Tv {
}

//Car 객체 생성을 위한 클래스 선언 .
class Car {
}