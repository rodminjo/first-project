package ch14.example5;

public class UsingLocalVariable {
	void method(int arg) { // arg와 localVar 은 final 특성을 가짐.
		int localVar = 40;

		// arg = 31;
		// localVar = 41;

		MyFunctionalInterface fi = () -> {
			System.out.println("arg :" + arg);
			System.out.println("localVar : " + localVar);
		};
		fi.method();
	}
}
