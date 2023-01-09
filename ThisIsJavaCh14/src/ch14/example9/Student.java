package ch14.example9;

public class Student {
	// field
	private String name;
	private int englishScore;
	private int mathScore;

	// constructor
	Student(String name, int englishScore, int mathScore) {
		this.name = name;
		this.englishScore = englishScore;
		this.mathScore = mathScore;
	}

	// method
	public String getName() {
		return name;
	}

	public int getEnglishScore() {
		return englishScore;
	}

	public int getMathScore() {
		return mathScore;
	}

}
