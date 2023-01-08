package ch10.example2;

public class Account {
	private long balance;

	public Account() {
	}

	public long getBlance() {
		return balance;

	}

	public void deposit(int money) {
		balance += money;
	}

	public void withdraw(int money) throws BalanceInsufficientException {
		if (balance < money) {
			throw new BalanceInsufficientException("잔고부족 " + (money - balance) + " 모자람.");
		} // 추후 출력할 오류메세지를 예외 객체 선언때 입력.
		balance -= money;
	}
}
