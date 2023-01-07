package ch2.example6;

public class IntLongFloatDoubleExample {

	public static void main(String[] args) {
		// int 예제
		int var1 = 10; // 10진수로 저장
		int var2 = 012; // 8진수 저장
		int var3 = 0xA; // 16진수 저장

		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);

		// long 예제
		Long var4 = (long) 100;
		Long var5 = 20L;
		// Long var7 = 10000000000000000; //L을 붙이지 않아 컴파일 에러
		Long var6 = 10000000000000000L;

		System.out.println(var4);
		System.out.println(var5);
		System.out.println(var6);

		// 실수값 저장
		double var8 = 3.14;
		// float var9 = 3.14; //컴파일 에러 발생
		float var10 = 3.14F;

		// 정밀도 보기
		double var11 = 0.1234567812345678;
		float var12 = 0.1234567812345678F;

		System.out.println(var8);
		System.out.println(var10);
		System.out.println(var11);
		System.out.println(var12); // 중간에 잘림

		int var13 = 3000000;
		double var14 = 3e6; // e6 = 10^6
		float var15 = 3e6F;
		double var16 = 2e-3;

		System.out.println(var13);
		System.out.println(var14);
		System.out.println(var15);
		System.out.println(var16);

	}

}
