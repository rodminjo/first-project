package ch13.example5.wildcard;

import java.util.Scanner;

public class PasswordDemo {

	public static void main(String[] args) {
		FirstPw<String, Integer> firstPw = new FirstPw<String, Integer>("자바", 1234);
		SecondPw<String, Integer> secondPw = new SecondPw<>();



		Scanner scanner = new Scanner(System.in);
		System.out.print("첫번째 비밀번호를 입력해주세요 >");
		String strpw = scanner.nextLine();
		System.out.print("두번째 비밀번호를 입력해주세요 >");
		int numpw = scanner.nextInt();
		
		secondPw.setNum(numpw);
		secondPw.setStr(strpw);
		scanner.close();
		
	   boolean check =  Password.<String, Integer> correct(firstPw, secondPw);
	   if(check) {
	   	System.out.println("패스워드가 일치합니다. 금고가 열립니다.");
	   }else {
	   	System.out.println("삐빅 패스워드가 일치 하지 않습니다. 남은 기회 2번");
	}
}
}

class Password<S, I> {
	public static <S, I> boolean correct(FirstPw<S, I> firstPw, SecondPw<S, I> secondPw) {
		boolean strPw = firstPw.getStr().equals(secondPw.getStr());
		boolean numPw = firstPw.getNum().equals(secondPw.getNum());
		return strPw && numPw;
	}
}
class FirstPw<S, I> {
	private S str;
	private I num;
	
	public FirstPw(S str, I num) {
		this.str = str;
		this.num = num;
	}
	public S getStr() {
		return str;
	}

	public I getNum() {
		return num;
	}

} 
class SecondPw<S, I> {
	Scanner scanner = new Scanner(System.in);
	private S str;
	private I num;
	
	public SecondPw() {}

	public void setStr(S str) {
		this.str = str;
	}
	public S getStr() {
		return str;
	}

	public void setNum(I num) {
		this.num = num;
	}
	public I getNum() {
		return num;
	}

}
