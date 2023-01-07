package ch4.example10;

public class BreakOutterExample {

	public static void main(String[] args) {

		// Outter : 라벨을 붙이는 행위 . 이를 통해 break의 범위를 설정가능
		Outter: for (char upper = 'A'; upper <= 'Z'; upper++) {
			for (char lower = 'a'; lower <= 'z'; lower++) {
				System.out.println(upper + "-" + lower);
				if (lower == 'g') {
					break Outter;
				}
			}
		}

		System.out.println("프로그램 종료 ");
	}

}
