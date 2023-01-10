package ch15.example4;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample1 {
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();

		set.add("Java");
		set.add("JDBC");
		set.add("Servlet/JSP");
		set.add("Java"); // Java는 한번만 저장됨.
		set.add("iBATIS");
		System.out.println(set.toString());

		int size = set.size();
		System.out.println("total size : " + size);

		Iterator<String> iterator = set.iterator();
		while (iterator.hasNext()) {
			System.out.println("\t" + iterator.next());
		}

		set.remove("JDBC");
		set.remove("iBATIS");

		size = set.size();
		System.out.println("total size : " + size);

		iterator = set.iterator();
		while (iterator.hasNext()) {
			System.out.println("\t" + iterator.next());
		}

		set.clear();
		if (set.isEmpty()) {
			System.out.println(set.toString());
			System.out.println("비어있음.");
		}
	}

}
