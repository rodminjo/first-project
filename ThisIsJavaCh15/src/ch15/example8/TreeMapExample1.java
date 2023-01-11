package ch15.example8;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample1 {

	public static void main(String[] args) {
		TreeMap<Integer, String> scores = new TreeMap<Integer, String>();
		scores.put(87, "홍길동");
		scores.put(98, "이동수");
		scores.put(75, "박길순");
		scores.put(95, "신용권");
		scores.put(80, "김자바");

		Map.Entry<Integer, String> entry = null;

		entry = scores.firstEntry();
		System.out.printf("가장낮은 점수: %d - %s", entry.getKey(), entry.getValue()).println();

		entry = scores.lastEntry();
		System.out.printf("가장높은 점수: %d - %s", entry.getKey(), entry.getValue()).println();

		entry = scores.lowerEntry(95);
		System.out.printf("95점보다 낮고 그중 가장높은 점수: %d - %s", entry.getKey(), entry.getValue()).println();

		entry = scores.higherEntry(95);
		System.out.printf("95점보다 낮고 그중 가장높은 점수: %d - %s", entry.getKey(), entry.getValue()).println();

		entry = scores.floorEntry(95);
		System.out.printf("95점과 같거나 낮은수 중 가장높은 점수: %d - %s", entry.getKey(), entry.getValue()).println();

		entry = scores.ceilingEntry(95);
		System.out.printf("95점과 같거나 낮은수 중 가장높은 점수: %d - %s", entry.getKey(), entry.getValue()).println();

		while (!scores.isEmpty()) {
			entry = scores.pollFirstEntry();
			System.out.printf("%d - %s , 남은 객체수 : %d", entry.getKey(), entry.getValue(), scores.size()).println();

		}

	}

}
