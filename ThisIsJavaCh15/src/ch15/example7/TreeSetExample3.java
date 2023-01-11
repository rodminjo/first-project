package ch15.example7;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetExample3 {
	public static void main(String[] args) {
	TreeSet<String> treeSet = new TreeSet<String>();
	treeSet.add("apple");
	treeSet.add("forever");
	treeSet.add("description");
	treeSet.add("ever");
	treeSet.add("zoo");
	treeSet.add("base");
	treeSet.add("guess");
	treeSet.add("cherry");
	System.out.println(treeSet.toString());
	System.out.println();
	
	System.out.println("c-f 사이 단어 검색");
	NavigableSet<String> rangeSet = treeSet.subSet("c", true, "f", true);
	// forever 는 f 이후 o 까지 붙어있어 범위에 포함이 안됨. "fp" 로 해주면 포함.
	System.out.println(rangeSet.toString());

}
}
