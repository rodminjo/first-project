package ch2.example9;

public class CastingExample {

	public static void main(String[] args) {
		// int - char 강제변환
		int intValue = 44032;
		char charValue = (char) intValue;
		System.out.println(charValue);

		// long - int 강제변환
		long longValue = 500;
		intValue = (int) longValue;
		System.out.println(intValue);

		// double - int 강제변환
		double doubleValue = 3.14;
		intValue = (int) doubleValue;
		System.out.println(intValue);
	}

}
