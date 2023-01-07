package ch13.example6.genericextends;

import java.util.Arrays;

//Storage 인터페이스 구현시킨 StorageImple 클래스.
public class StorageImple<T> implements Storage<T> {

	private T[] array;

	// 배열 크기를 받아 배열 생성.
	public StorageImple(int capacity) {
		this.array = (T[]) (new Object[capacity]);
	}

	@Override
	public void add(T item, int index) {
		array[index] = item;
	}

	@Override
	public T get(int index) {
		return array[index];
	}

	// array 를 출력하기 위한 오버라이딩.
	@Override
	public String toString() {
		return Arrays.toString(array);
	}

}
