package ch7.example4;

public class ChildExample {

	public static void main(String[] args) {
		Child child = new Child();

		// 타입변환
		Parent parent = child;

		parent.method1();
		parent.method2();
		// parent.method3();
	}

}
