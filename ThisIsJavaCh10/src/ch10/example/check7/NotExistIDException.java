package ch10.example.check7;

public class NotExistIDException extends Exception {
	public NotExistIDException() {
	}
	public NotExistIDException(String message) {
		super(message);
	}
}
