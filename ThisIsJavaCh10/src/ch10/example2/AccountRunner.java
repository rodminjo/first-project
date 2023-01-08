package ch10.example2;

public class AccountRunner {

	public static void main(String[] args) {
		Account account = new Account();

		// 예금하기
		account.deposit(10000);
		System.out.println("예금액 : " + account.getBlance());
		
		//출금하기
		try {
			account.withdraw(30000);
		} catch (BalanceInsufficientException e) {
			String message = e.getMessage(); // 예외 클래스 생성자에서 입력한 오류메세지 출력.
			System.out.println(message);
			System.out.println();
			e.printStackTrace(); // 예외 추적 후 출력하는 메소드.
		}
		String str = "roro";
		boolean bo = account.equals(str);
	}

}
