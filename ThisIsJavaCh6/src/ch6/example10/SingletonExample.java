package ch6.example10;

public class SingletonExample {

	public static void main(String[] args) {
		// Singleton obj1 = new Singleton(); //생성자에 private 로 인해 객체 생성 안됨 .
		
		
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
	
		if(obj1 == obj2) {
			System.out.println("같은 Singleton 객체 입니다.");
		}else {
			System.out.println("다른 Singleton 객체 입니다.");
		}

	}
}
