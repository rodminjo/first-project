package ch2.example4;

public class GarbageValueExample {

	public static void main(String[] args) {
		byte var1 = 125;
		int var2 = 125;

		// for 반복문
		for (int i = 0; i < 5; i++) {
			// ++는 1 씩 올려준단 의미
			var1++;
			var2++;
		}

		// \t 는 칸을 텝만큼 띄어줌
		// byte 는 넘어가는 순간 -로 다시 돌아감
		System.out.printf("var1: %d \t var2: %d", var1, var2);
	}

}
