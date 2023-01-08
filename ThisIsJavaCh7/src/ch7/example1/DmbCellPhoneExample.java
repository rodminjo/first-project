package ch7.example1;

public class DmbCellPhoneExample {

	public static void main(String[] args) {
		DmbCellPhone my = new DmbCellPhone("iphone", "white", 10);
		// 부모 클래스 필드
		System.out.println("모델: " + my.model);
		System.out.println("color : " + my.color);
		// 자식 클래스 필드
		System.out.println("channel: " + my.channel);

		// 부모클래스 메소드 실행
		my.powerOn();
		my.bell();
		my.SendVoice("Hi");
		my.receiveVoice(":)");
		my.hangUp();
		my.poweroff();

		// 자식클래스 메소드 실행
		my.turnOnDmb();
		my.changeChannelDmb(20);
		my.turnOffDmb();
	}

}
