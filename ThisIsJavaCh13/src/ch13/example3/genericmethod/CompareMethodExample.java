package ch13.example3.genericmethod;

public class CompareMethodExample {

	public static void main(String[] args) {
		// 타입 명시.
		Pair<Integer, String> p1 = new Pair<Integer, String>(1, "사과");
		Pair<Integer, String> p2 = new Pair<Integer, String>(1, "사과");
		boolean result1 = Util.<Integer, String>compare(p1, p2);
		if (result1) {
			System.out.println("논리적으로 동등한 객체입니다.");
		} else {
			System.out.println("논리적으로 동등하지 않은 객체입니다.");
		}
		
		// 타입을 명시하지 않아 추정.
		Pair<String, String> p3 = new Pair<>("user1", "홍길");
		Pair<String, String> p4 = new Pair<>("user2", "홍길");
		boolean result2 = Util.compare(p3, p4);
		if (result2) {
			System.out.println("논리적으로 동등한 객체입니다.");
		} else {
			System.out.println("논리적으로 동등하지 않은 객체입니다.");
		}
		
	}

}