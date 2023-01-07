package ch4.example11;

public class ContinueExample {

	public static void main(String[] args) {

		// continue로 그 반복이 끝나 짝수는 출력이 안됨.
		for (int i = 0; i < 10; i++) {
			if (i % 2 == 0) {
				continue;
			}
			System.out.println(i);
		}
	}

}
