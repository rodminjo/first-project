package ch6.example.check19;

public class Account {
	static int MIN_BALANCE = 0;
	static int MAX_BALANCE = 1000000;

	int balance;

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		if (balance > Account.MIN_BALANCE && balance < Account.MAX_BALANCE) {
		this.balance = balance;
		}
	}

}
