package ch4.example6;

public class ForMultiplicationTableExample {
	// for문 중첩 가능
	public static void main(String[] args) {
		for (int i = 1; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				System.out.printf("%d * %d = %d", i, j, i * j).println();
			}
		}
	}

}
