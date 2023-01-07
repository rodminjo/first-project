package ch4.example.check;

public class Example6 {
	public static void main(String[] args) {
		// 방법 1
		for (int i = 1; i <= 5; i++) {
			System.out.println("*".repeat(i));
		}

		// 방법 2
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
