package day02;

public class IntegerEx {

	public static void main(String[] args) {
		
		byte a = 127;
		byte a1 = -128;
		
		short b = 32767;
		short b1 = -32768;
		
		int c = 2147483647;
		int c1 = -2147483648;
		
		long d = 123123123123123L; //L을 붙임
		System.out.println(d);
		
		/*
		 * 2진수를 저장할 때는 0b를 붙임
		 * 8진수를 저장할 때는 0을 붙임
		 * 16진수를 저장할 때는 0x를 붙임
		 * 
		 */
		
		int bin = 0b1010;
		System.out.println("2진수1010:" + bin + "입니다");
		
		
		System.out.println("--------------------------------");
		
		float f1 = 3.14F;
		double d1 = 3.14;
		
		System.out.println(f1);
		System.out.println(d1);
		
		float f2 = 3.14159265358F; //7자리
		double d2 = 3.14159265358; //15자리
		
		System.out.println(f2);
		System.out.println(d2);
		
		//e표기법
		float f3 = 314.15e-2F;
		double d3 = 0.0031415e3;
		
		System.out.println(f3);
		System.out.println(d3);
		
		System.out.println("--------------------------------");
		boolean bool1 = true;
		boolean bool2 = false;
		System.out.println(bool1);
		System.out.println(bool2);
		
	}
}
