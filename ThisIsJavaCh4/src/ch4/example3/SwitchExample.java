package ch4.example3;

public class SwitchExample {

	public static void main(String[] args) {
		int num = (int) (Math.random() * 6) + 1;

		switch (num) {
		case 1:
			System.out.println(num);
			break; // break를 하지 않으면 아래 문장 전부 실행됨.
		case 2:
			System.out.println(num);
			break;
		case 3:
			System.out.println(num);
			break;
		case 4:
			System.out.println(num);
			break;
		case 5:
			System.out.println(num);
			break;
		case 6:
			System.out.println(num);
			break; // 하면 형식의 통일성이 있음. 안해도 상관은 없음.
		}
	}

}
