package ch8.example2;

public interface RemoteControl {
	// 상수
	public static final int MAX_VALUE = 10;
	public static final int MIN_VALUE = 0;
	// 추상메소드
	public void turnOn();

	public void turnOff();

	public void setVolume(int volume);


	// 디폴트 메소드
	default void setMute(boolean mute) {
		if (mute) {
			System.out.println("무음처리 합니다.");
		} else {
			System.out.println("무음해제 합니다.");
		}
	}
	// 정적메소드
	static void changeBattery() {
		System.out.println("건전지를 교환합니다.");
	}
}
