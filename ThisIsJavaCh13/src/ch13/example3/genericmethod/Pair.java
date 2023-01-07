package ch13.example3.genericmethod;

public class Pair<K, V> {
	private K key;
	private V value;

	public Pair(K key, V value) {
		this.key = key;
		this.value = value;
	}

	// setter , getter
	public void setKey(K key) {
		this.key = key;
	}

	public K getKey() {
		return key;
	}

	public V getValue() {
		return value;
	}

	public void setValue(V value) {
		this.value = value;
	}

}
