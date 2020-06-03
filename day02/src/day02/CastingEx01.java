package day02;

public class CastingEx01 {

	public static void main(String[] args) {
		
		/*
		 * 크기가 작은 타입을 큰 타입에 넣을 때는
		 * 자바 가상머신 JVM이 자동으로 형변환을 해줍니다.
		 */
		
		byte b = 10;
	
		short s = b; //byte -> short 자동형변환
		int i = b; //byte -> int 자동형변환
		long l = b; //byte -> long
		
		System.out.println(s);
		System.out.println(i);
		System.out.println(l);
		
		char c = '가';
		int j = c; //char -> int형 변환
		System.out.println("가의 유니코드숫자값:" + j);
		
		int k = 1000;
		double d = k;//int -> double형 변환
		System.out.println(d);
		
		
		
		
		
	}
}
