package ch4.example1;

public class IfExample {

	public static void main(String[] args) {
		int score = 93;

		if (score >= 90) {
			System.out.println("90 Up!");
			System.out.println("your grade is A");
		}

		if (score < 90) {
			System.out.println("90 Down!");
		}
		System.out.println("your grade is B"); // 중괄호가 없다면 바로 아랫줄만 실행문이 됨 .

		// 아래와 같이 수정 가능
		if (score >= 90) {
			System.out.println("90 Up!");
			System.out.println("your grade is A");
		} else {
			System.out.println("90 Down!");
			System.out.println("your grade is B");
		}
		
		// 다중으로 실행 가능
		if (score >= 90) {
			System.out.println("90 Up!");
			System.out.println("your grade is A");
		} else if(score >= 80) {
			System.out.println("80 Up!");
			System.out.println("your grade is B");
		} else if(score >= 70) {
			System.out.println("70 Up!");
			System.out.println("your grade is C");
		} else {
			System.out.println("60 Up!");
			System.out.println("your grade is D");
		}

	}

}
