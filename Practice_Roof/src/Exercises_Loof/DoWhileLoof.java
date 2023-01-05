package Exercises_Loof;

import java.util.Scanner;

public class DoWhileLoof {
	Scanner scanner = new Scanner(System.in);



	public void printCubeOfNumber() {
		int number = 0;
		do {
			System.out.print("Enter a number: ");
			number = scanner.nextInt();
			if(number >=0) {
				System.out.println("cube is "+ (number * number * number));
			} else {
				System.out.println("Thank You! Have Fun!");
			}

		} while (!(number < 0));
	}

}
