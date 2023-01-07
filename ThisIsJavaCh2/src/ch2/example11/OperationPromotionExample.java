package ch2.example11;

public class OperationPromotionExample {

	public static void main(String[] args) {
		byte byteValue1 = 10;
		byte byteValue2 = 20;
		// byte byteValue3 = byteValue1 + byteValue2; // 연산때 자동 타입변환되어 컴파일 오류. 우변에
		// (byte) 붙여주던가 변수를 int로 할 것
		int intValue1 = byteValue1 + byteValue2;
		System.out.println(intValue1);

		char charValue1 = 'A';
		char charValue2 = 1;
		// char charValue3 = charValue1 + charValue2;
		int intValue2 = charValue1 + charValue2;
		System.out.println(intValue2);

		int intValue3 = 10;
		int intValue4 = intValue3 / 4;
		System.out.println(intValue4);

		int intValue5 = 10;
		// int intValue6 = intValue3 / 4.0; // 4.0은 double 타입이라 오류
		double doubleValue = intValue5 / 4.0;
		System.out.println(doubleValue);
	}

}
