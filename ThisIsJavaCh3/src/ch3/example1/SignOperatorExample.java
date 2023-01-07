package ch3.example1;

public class SignOperatorExample {

	public static void main(String[] args) {
		int x = -100;
		int result1 = +x;
		int result2 = -x;
		System.out.printf("result1 : %d", result1).println();
		System.out.printf("result2 : %d", result2).println();

		short s = 100;
		// short result3 = -s; //컴파일 에러 : 강제 타입변환 필요
		int result3 = -s;
		System.out.println(result3);
	}

}
