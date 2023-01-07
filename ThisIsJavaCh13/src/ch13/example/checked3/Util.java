package ch13.example.checked3;

public class Util {

	public static <T extends Pair<K, V>, K, V> V getValue(T t, K k) {
		if(t.getKey() == k) {
			return t.getValue();
		}
		return null;
	}
	// 2번째 방법. Pair 는 이미 상속되어 있음을 이용.
//	public static <K , V> V getValue(Pair<K,V> p , K k) {
//		if(p.getKey() == k) {
//			return p.getValue();
//		}
//		return null;
//	}

}
