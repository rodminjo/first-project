package LoofPractice;

public class MyNumber {
	private int number = 0;

	public MyNumber(int number) {
		this.number = number;
	}

	public boolean isPrime() {
		if (this.number < 2) {
			return false;
		} // Guard Check

		int sum = 0;

		for (int i = 1; i <= this.number; i++) {
			if (this.number % i == 0) {
				sum = sum + i;
			}
		}

		if (sum == this.number + 1) {
				return true;
			}

		return false;
	}
	// 다른방법 : i = 2부터 number -1 까지 루프를 돌리고 나머지가 0이 되는 값이 있으면 false 출력.

	public int sumUptoN() {
		int sumUp = 0;
		for (int i = 0; i <= this.number; i++) {
			sumUp = sumUp + i;
		}

		return sumUp;
	}

	public int sumOfDivisors() {

		int sum = 0;

		for (int i = 1; i <= this.number / 2; i++) {
			if (this.number % i == 0) {
				sum = sum + i;
			}
		}

		return sum + this.number;
	}

	public void printNumberTriangle() {
		
		
		for (int i = 1; i <= this.number; i++) {
			for (int j = 1; j <= i; j++) {
				if (j < i) {
					System.out.print(j + " ");
				} else {
					System.out.println(j + " ");
				}
			}
		}
	}
}

