package ch8.example1;

interface RemoteControl {
	// static final
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;

	// abstract method
	void turnOn();

	void turnOff();

	void setVolume(int volume);

	// default method
	default void setMute(boolean mute) {
		if (mute) {
			System.out.println("무음처리합니다.");
		} else {
			System.out.println("무음해제합니다.");
		}
	}

	// static method
	static void changeBattery() {
		System.out.println("건전지를 교환합니다.");
	}

}
