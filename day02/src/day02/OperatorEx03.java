package day02;

public class OperatorEx03 {

	public static void main(String[] args) {
		
		int x = 10, y = 20;
		
		//if 뒤에 소괄호 가 true라면 if중괄호를 실행, false라면 else중괄호를 실행
		if( x != 10 && ++y == 21 ) { //두개짜리 연산자 논리연산자는 만족할 수 없는 조건일 때 뒤를 실행하지 않음.
			System.out.println("참 입니다");
		} else {
			System.out.println("거짓 입니다");
		}
		
		System.out.println("x값:" + x);
		System.out.println("y값:" + y);
		
		
		if( x == 10 || ++y == 21 ) {
			System.out.println("참 입니다");
		} else {
			System.out.println("거짓 입니다");
		}
		
		System.out.println("x값:" + x);
		System.out.println("y값:" + y);
		
		
		
		
		
		
		
	}
}
