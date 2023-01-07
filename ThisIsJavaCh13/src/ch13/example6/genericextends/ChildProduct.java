package ch13.example6.genericextends;

//product 에 C 타입 변수의 getter,setter 추가.
public class ChildProduct<T, M, C> extends Product<T, M> {
	private C company;

	public C getCompany() {
		return this.company;
	}

	public void setCompany(C company) {
		this.company = company;
	}

	// 출력하기 위한 toString() 오버라이딩.
	@Override
	public String toString() {
		return String.format("Kind : %s Model : %s, Company:  %s", super.getKind(), super.getModel(), this.company);
	}

}
