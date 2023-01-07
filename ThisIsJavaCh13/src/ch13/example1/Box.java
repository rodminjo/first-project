package ch13.example1;

// <T> 라는 제네릭 타입을 선언.
public class Box<T> {

	// field
	private T t;

	// constructor

	// method
	public void set(T t) {
		this.t = t;
	}

	public T get() {
		return t;
	}

}
