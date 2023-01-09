package ch15.example3;

public class Board {
	// field
	String subject;
	String content;
	String wirter;

	// constructor
	public Board(String subject, String content, String wirter) {
		this.subject = subject;
		this.content = content;
		this.wirter = wirter;
	}

	@Override
	public String toString() {
		return String.format("subject : %s \t contents : %s \t wirter : %s", this.subject, this.content, this.wirter);
	}
}
