package ch3.example3;

public class BitReverseExample {

	public static void main(String[] args) {
		int v1 = 10;
		int v2 = ~v1; // -11 출력 .
		int v3 = ~v1 + 1; // ~v1 +1 하면 부호가 반대인 정수 출력
		System.out.println(toBinaryString(v1) + "십진수: " + v1 + ")");
		System.out.println(toBinaryString(v2) + "십진수: " + v2 + ")");
		System.out.println(toBinaryString(v3) + "십진수: " + v3 + ")");
		System.out.println();

		int v4 = -10;
		int v5 = ~v4; // -11 출력 .
		int v6 = ~v4 + 1; // ~v1 +1 하면 부호가 반대인 정수 출력
		System.out.println(toBinaryString(v4) + "십진수: " + v4 + ")");
		System.out.println(toBinaryString(v5) + "십진수: " + v5 + ")");
		System.out.println(toBinaryString(v6) + "십진수: " + v6 + ")");
		System.out.println();

	}

	// 정적 선언을 하여 메소드자체 출력 되도록 함.
	// str 이 32개 채워지도록 하는 메소드 .
	public static String toBinaryString(int number) {
		String str = Integer.toBinaryString(number);
		while (str.length() < 32) {
			str = "0" + str;
		}

		return str;
	}
}