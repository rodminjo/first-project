
//변수는 중괄호 안에서만 사용가능하다  

package ch2.example2;

public class VariableScopeExample {

	public static void main(String[] args) {
		int v1 = 15;
		if (v1 > 10) {
			int v2 = v1 - 10;
		}
		// int v3 = v1 + v2 + 5; // v2 변수 를 사용할 수 없어 컴파일 에러 생김

	}

}
