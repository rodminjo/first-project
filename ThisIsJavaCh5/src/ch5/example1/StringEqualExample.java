package ch5.example1;

public class StringEqualExample {

	public static void main(String[] args) {
		String strVar1 = "조경민";
		String strVar2 = "조경민";

		if (strVar1 == strVar2) {
			System.out.println("참조가 같음 ");
		} else {
			System.out.println("참조가 다름 ");
		}

		if (strVar1.equals(strVar2)) {
			System.out.println("문자열 같음 ");
		}
		String strVar3 = new String("조경민");
		String strVar4 = new String("조경민");

		if (strVar3 == strVar4) {
			System.out.println("참조가 같음 ");
		} else {
			System.out.println("참조가 다름 ");
		}

		if (strVar1.equals(strVar2)) {
			System.out.println("문자열 같음 ");
		}
		

	}

}
