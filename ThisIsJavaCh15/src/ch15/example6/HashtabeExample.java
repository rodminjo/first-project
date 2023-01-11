package ch15.example6;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class HashtabeExample {

	public static void main(String[] args) {
		Map<String, String> map = new Hashtable<String, String>();

		map.put("Spring", "12");
		map.put("Summer", "123");
		map.put("Fall", "1234");
		map.put("Winter", "12345");

		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.println("아이디와 비밀번호 입력.");
			System.out.println("아이디 > ");
			String id = scanner.next();

			System.out.println("비밀번호 > ");
			String password = scanner.next();
			System.out.println();

			if (map.containsKey(id)) {
				if (map.get(id).equals(password)) {
					System.out.println("로그인 되었습니다.");
					break;
				} else {
					System.out.println("비밀번호가 일치하지 않습니다.");
				}
			} else {
				System.out.println("아이디가 존재하지 않습니다.");
			}

		}

	}

}
