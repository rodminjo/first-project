package ch8.example3;

public class Bus implements Vehicle {
	@Override
	public void run() {
		System.out.println("버스가 달립니다.");
	}

	@Override
	public void test() {
		System.out.println("테스트 완료");
	}

}
