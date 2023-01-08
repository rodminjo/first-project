package ch6.example13;

public class Person {

	// 필드.
	private String name;
	private int age;
	private int height;
	private int weight;

	// 생성자
	public Person(String name, int age, int height, int weight) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}

	public Person() {
		this.name = "익명";
		this.age = 0;
		this.height = 0;
		this.weight = 0;
	}

	// 메소드

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return this.age;
	}

	public void setAge(int age) {
		this.age = age;
	}


	public int getHeight() {
		return this.height;
	}

	public void setHeight(int height) {
		this.height = height;
	}


	public int getWeight() {
		return this.weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public void show() {
		System.out.printf("이름은 %s 나이는 %d 이며 키 %d cm 몸무게 %d kg 입니다.", this.name, this.age, this.height, this.weight)
				.println();

	}

}