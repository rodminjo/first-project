package ch13.example4.limitedparameter;

public class Util2 {
	// Number을 상속하여 T 타입을 제한.
	public static <T extends Number> int compare(T t1, T t2) {
		double v1 = t1.doubleValue();
		double v2 = t2.doubleValue();
		
		return Double.compare(v1, v2);
	}
}
