package ch15.example5;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample1 {
// ghd
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();

		map.put("신용권", 85);
		map.put("홍길동", 90);
		map.put("동장군", 80);
		map.put("홍길동", 95);
		System.out.println("total Entry : " + map.size());

		System.out.println("홍길동 :" + map.get("홍길동"));
		System.out.println();

		Set<String> keySet = map.keySet();
		Iterator<String> iterator = keySet.iterator();

		while (iterator.hasNext()) {
			String key = iterator.next();
			Integer value = map.get(key);
			System.out.printf("key : %s \tvlaue : %d", key, value).println();
		}
		System.out.println();

		map.remove("홍길동");
 		System.out.println("총 Entry 수 : " + map.size());
        map.clear();
		Set<Map.Entry<String, Integer>> set = map.entrySet();
		Iterator<Map.Entry<String, Integer>> iteratorEntry = set.iterator();

		while (iteratorEntry.hasNext()) {
			Map.Entry<String, Integer> entry = iteratorEntry.next();
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.printf("key : %s \tvlaue : %d", key, value).println();
		}
		System.out.println();


		map.clear();
		System.out.println("total Entry : " + map.size());
	}

}
