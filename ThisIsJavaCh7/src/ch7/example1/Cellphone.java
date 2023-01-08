package ch7.example1;

public class Cellphone {
	// field
	String model;
	String color;

	// constructor
	public Cellphone(String model, String color) {
		this.model = model;
		this.color = color;
	}

	// method
	void powerOn() {
		System.out.println("전원을 켭니다.");
	}

	void poweroff() {
		System.out.println("전원을 끕니다.");
	}

	void bell() {
		System.out.println("벨이 울립니다.");
	}

	void SendVoice(String message) {
		System.out.println("나 : " + message);
	}

	void receiveVoice(String message) {
		System.out.println("상대방 : " + message);
	}

	void hangUp() {
		System.out.println("전화를 끊습니다.");
	}


}
