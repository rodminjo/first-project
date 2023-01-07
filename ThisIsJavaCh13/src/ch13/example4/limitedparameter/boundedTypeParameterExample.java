package ch13.example4.limitedparameter;


public class boundedTypeParameterExample {

	public static void main(String[] args) {
		// String str = Util2.compare("a", "b"); //String 은 Number 타입이 아니기 때문에 오류 발생.

		int result1 = Util2.compare(10, 20);
		System.out.println(result1);

		int result2 = Util2.compare(4.5, 3);
		System.out.println(result1);
	}

}
