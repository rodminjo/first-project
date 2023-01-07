package ch13.example1;

public class boxExample {

	public static void main(String[] args) {
		// 제네릭을 이용한 String타입 객체 생성.
		Box<String> box1 = new Box<>();
		box1.set("Hello");
		String str = box1.get();
		System.out.println(str);


		// 제네릭을 이용한 Integer타입 객체 생성.
		Box<Integer> box2 = new Box<>();
		box2.set(6);
		Integer num = box2.get();
		System.out.println(num);
	}

}
