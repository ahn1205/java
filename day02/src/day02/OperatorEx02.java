package day02;

public class OperatorEx02 {

	public static void main(String[] args) {
		
		//2항연산자
		int i = 7 / 3;//2
		int j = 7 % 3;//1
		int k = 7 * 3;//21
		
		//비교연산
		System.out.println(i == j);//f
		System.out.println(i != j);//t
		System.out.println(i >= j);//t
		System.out.println(i < j); //f
		System.out.println(k != 21); //f
		System.out.println(k % 2 != 0); //t
		System.out.println(k % 2 == 1); //t
		
		
		//비트연산자
		int a = 5; //0000 0101
		int b = 3; //0000 0011
		
		System.out.println(a & b); //0000 0001 ->두 비트값이 1이면 1을 반환
		System.out.println(a | b); //0000 0111 ->두 비트중 하나만 1이여도 1을반환
		System.out.println(a ^ b); //0000 0110 ->다르면 1 같으면 0
		
		//비트 쉬프트 >> <<
		int h = 100;
		System.out.println( h >> 2);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
