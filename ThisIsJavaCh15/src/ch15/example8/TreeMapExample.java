package ch15.example8;

import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapExample {

	public static void main(String[] args) {
		NavigableMap<Integer, String> scores = new TreeMap<Integer, String>();
		scores.put(87, "홍길동");
		scores.put(98, "이동수");
		scores.put(75, "박길순");
		scores.put(95, "신용권");
		scores.put(80, "김자바");

		NavigableMap<Integer, String> descendingMap = scores.descendingMap();
		Set<Map.Entry<Integer, String>> descendingMapSet = descendingMap.entrySet();
		for (Map.Entry<Integer, String> ele : descendingMapSet) {
			System.out.println("Score : " + ele.getKey() + " - " + ele.getValue());
		}
		System.out.println();

		NavigableMap<Integer, String> ascendingMap = descendingMap.descendingMap();
		Set<Map.Entry<Integer, String>> ascendingMapSet = ascendingMap.entrySet();
		for (Map.Entry<Integer, String> ele : ascendingMapSet) {
			System.out.println("Score : " + ele.getKey() + " - " + ele.getValue());
		}

	}

}
