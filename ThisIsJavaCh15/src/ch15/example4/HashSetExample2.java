package ch15.example4;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample2 {
	public static void main(String[] args) {
		Set<Member> set = new HashSet<Member>();

		System.out.println(set.add(new Member("hong", 30)));
		System.out.println(set.add(new Member("hong", 30)));

		System.out.println("총 객체수 : " + set.size());
	}
}
