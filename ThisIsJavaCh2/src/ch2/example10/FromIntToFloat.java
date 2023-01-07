package ch2.example10;

public class FromIntToFloat {

	public static void main(String[] args) {
		int num1 = 123456780;
		int num2 = 123456780;

		float num3 = num2; // double로 하면 정밀도 업
		num2 = (int) num3;

		int result = num1 - num2;

		// 손실이 일어남을 알 수 있음 .
		System.out.println(result);
	}

}
