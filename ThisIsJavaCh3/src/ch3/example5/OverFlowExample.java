package ch3.example5;

public class OverFlowExample {

	public static void main(String[] args) {
		int x = 100000;
		int y = 100000;
		int z = x * y;
		System.out.println(z);

		long x1 = 100000;
		long y2 = 100000;
		long z3 = x1 * y2;
		System.out.println(z3);
	}

}
