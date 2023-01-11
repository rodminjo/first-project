package ch15.example9;

public class ChildExample {

	public static void main(String[] args) {
		// 구현 객체 사용
		B b1 = new Child();
		System.out.println(b1.method(20, 10));

		// 익명 구현 객체
		B b2 = new B() {
			@Override
			public int method(int x, int y) {
				return x * y;
			}
		};
		System.out.println(b2.method(20, 10));
		// 람다식 이용
		B b3 = (int x, int y) -> x * y;
		System.out.println(b3.method(20, 10));
	}

}
