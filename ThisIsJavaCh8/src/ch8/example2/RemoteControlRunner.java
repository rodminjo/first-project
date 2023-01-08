package ch8.example2;

public class RemoteControlRunner {

	public static void main(String[] args) {
		RemoteControl tv = new Tellevision();
		RemoteControl audio = new Audio();

		tv.turnOn();
		tv.turnOff();
		tv.setVolume(11);
		tv.setMute(false);
		// static method used
		RemoteControl.changeBattery();

		audio.turnOn();
		audio.turnOff();
		audio.setVolume(11);
		audio.setMute(false);
		RemoteControl.changeBattery();

		// 익명구현객체.
		RemoteControl rc = new Tellevision() {
			@Override
			public void turnOn() {System.out.println("turn on");}
			@Override
			public void turnOff() {System.out.println("turn off");}
		};

		rc.turnOn();
	}

}
