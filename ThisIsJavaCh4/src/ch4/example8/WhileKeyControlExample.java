package ch4.example8;

public class WhileKeyControlExample {

	public static void main(String[] args) throws Exception {
		boolean run = true;
		int speed = 0;
		int keyCode = 0;

		while (run) {
			// 키보드에서 1 +enter 키를 누르면 49 , 13, 10 이 입력됨. 이 13과 10을 없에기 위함.
			if (keyCode != 13 && keyCode != 10) {
				System.out.println("-----------");
				System.out.println("1.증속 | 2. 감속 |3. 중지 ");
				System.out.println("-----------");
				System.out.println("선택 : ");
			}
			// 키보드의 입력을 읽는 코드
			keyCode = System.in.read();

			if (keyCode == 49) {
				speed++;
				System.out.println("현재속도 = " + speed);
			} else if (keyCode == 50) {
				System.out.println("현재속도 = " + speed);
			} else if (keyCode == 51) {
				run = false;
			}
		}

		System.out.println("프로그램 종료 ");
	}

}
