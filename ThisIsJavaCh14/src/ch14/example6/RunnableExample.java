package ch14.example6;

public class RunnableExample {

	public static void main(String[] args) {
		// Runnable 인터페이스도 한개의 추상메소드를 가지는 인터페이스
		// 한개의 추상메소드를 가지는 인터페이스는 람다식을 이용하여 인스턴스 생성 가능.

		Runnable runnable = () -> {
			for (int i = 0; i < 10; i++) {
				System.out.println(i);
			}
		};
		// 방법1 : 위의 runnable 메소드를 가져올 수 있음.
		Thread thread = new Thread(runnable);
		// 방법2 : 직접 익명객체 생성해서 넣어 줄 수 있음.
		Thread thread2 = new Thread(() -> {
			for (int i = 0; i < 10; i++) {
				System.out.println(i);
			}
		});

		thread.start();
		thread2.start();
	}

}
