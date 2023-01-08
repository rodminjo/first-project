package ch8.example2;

public class Audio implements RemoteControl {
	// field
	private int volume;
	// constructor

	// method
	@Override
	public void turnOn() {
		System.out.println("Audio ON");
	}

	@Override
	public void turnOff() {
		System.out.println("Audio OFF");
	}

	@Override
	public void setVolume(int volume) {
		if (volume > RemoteControl.MAX_VALUE) {
			this.volume = RemoteControl.MAX_VALUE;
		} else if (volume < RemoteControl.MIN_VALUE) {
			this.volume = RemoteControl.MIN_VALUE;
		} else {
			this.volume = volume;
		}
		System.out.println("현재 Audio volume is " + this.volume);
	}

}
