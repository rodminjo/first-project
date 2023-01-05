package Exercises_Loof;

public class WhileNumberPlayer {
	private int number = 0;

	public WhileNumberPlayer(int number) {
		this.number = number;
	}

	public void printSquaresUptoLimit() {
		for (int i = 1; i * i <= this.number; i++) {
			System.out.print((i * i) + " ");
		}
		System.out.println("");

		int j = 1;
		while (j*j <= this.number) {
			System.out.print((j * j) + " ");
			j++;
		}
		System.out.println("");
	}

	public void printCubesUptoLimit() {
		for (int i = 1; i * i *i <= this.number; i++) {
			System.out.print((i * i * i) + " ");
		}
		System.out.println("");

		int j = 1;
		while (j * j * j <= this.number) {
			System.out.print((j * j * j) + " ");
			j++;
		}
		System.out.println("");
	}
}
