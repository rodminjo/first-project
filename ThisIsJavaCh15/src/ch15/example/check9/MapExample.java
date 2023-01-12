package ch15.example.check9;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExample {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("blue", 96);
		map.put("hong", 86);
		map.put("white", 92);

		String name = null; // 최고점수 받은 아이디 저장.
		int maxScore = 0; // 최고 점수 저장.
		int totalScore = 0; // 점수 합계 저장.

		Set<Map.Entry<String, Integer>> set = map.entrySet();

		// 반복자 이용
//		Iterator<Map.Entry<String, Integer>> iterator = set.iterator();
//		while (iterator.hasNext()) {
//			Map.Entry<String, Integer> entry = iterator.next();
//			if (maxScore <= entry.getValue()) {
//				maxScore = entry.getValue();
//				name = entry.getKey();
//			}
//			totalScore += entry.getValue();
//		}

		// for문 이용 .
		for (Map.Entry<String, Integer> entry : set) {
			if (maxScore <= entry.getValue()) {
				maxScore = entry.getValue();
				name = entry.getKey();
			}
			totalScore += entry.getValue();
		}

		System.out.println("평균점수 :" + (totalScore / set.size()));
		System.out.println("최고점수 :" + maxScore);
		System.out.println("최고 점수를 받은 아이디 :" + name);
		
	}

}
