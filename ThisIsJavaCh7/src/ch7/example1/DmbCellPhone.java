package ch7.example1;

public class DmbCellPhone extends Cellphone {
	// field
	int channel;


	// constructor
	public DmbCellPhone(String model, String color, int channel) {
		super(model, color);
		this.channel = channel;
	}


	// method
	void turnOnDmb() {
		System.out.println("채널 " + channel + "번 방송 수신.");
	}

	void changeChannelDmb(int channel) {
		System.out.println("채널 " + channel + "번 방송 변경.");
	}
	void turnOffDmb() {
		System.out.println("전원 끕니다. ");
	}

}
