package ch2.example3;

public class ByteExample {

	public static void main(String[] args) {
		byte var1 = -128;
		byte var2 = -30;
		byte var3 = 0;
		byte var4 = 30;
		byte var5 = 127;
		// byte var6 = 128; //컴파일 오류 생김

		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);
		System.out.println(var4);
		System.out.println(var5);

		// 최대 최소 확인
		System.out.println(Byte.MAX_VALUE);
		System.out.println(Byte.MIN_VALUE);

	}

}
