package ch10.example2;

public class BalanceInsufficientException extends Exception {
	BalanceInsufficientException() {
	}

	BalanceInsufficientException(String message) {
		super(message);
	}
}
