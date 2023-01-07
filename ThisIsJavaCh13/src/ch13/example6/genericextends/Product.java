package ch13.example6.genericextends;

//타임 T,M을 가지고 setter, getter 가진 클래스 
public class Product<T, M> {
	private T kind;
	private M model;

	public T getKind() {
		return this.kind;
	}

	public M getModel() {
		return this.model;
	}

	public void setKind(T kind) {
		this.kind = kind;
	}

	public void setModel(M model) {
		this.model = model;
	}


}

class Tv {
	// tv 객체를 Kind 출력시 Tv로 나오기 위함.
	@Override
	public String toString() {
		return "Tv";
	}
}