package ch6.example.check16;

public class Printer {
	// 메소드 오버로딩 해볼것
	public int println(int i) {
		System.out.println(i);
		return i;
	}

	public boolean println(boolean b) {
		System.out.println(b);
		return b;
	}

	public double println(double d) {
		System.out.println(d);
		return d;
	}

	public String println(String s) {
		System.out.println(s);
		return s;
	}
}
