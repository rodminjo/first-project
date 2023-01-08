package ch10.example1;

public class CastException {


	public static void main(String[] args) {
		try {
		Dog dog = new Dog();
		changeDog(dog);

		// Cat cat = new Cat();
		// changeDog(cat); // 고양이가 개가 될 순 없음.
	} catch (ClassCastException e) {
		System.out.println("고양이는 개가 아닙니다.");
	} finally {
		System.out.println("zzz");
	}
	}
	public static void changeDog(Animal animal) {
		Dog dog = (Dog) animal;
		System.out.println("개가 되었습니다.");
	}
}



class Animal {
	
}

class Dog extends Animal {
	
}

class Cat extends Animal {
	
}