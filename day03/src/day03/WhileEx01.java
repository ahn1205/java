package day03;

public class WhileEx01 {

	public static void main(String[] args) {
		
		int a = 1; //제어변수: 반복문의 횟수를 제어할 변수
		int sum = 0;
		
		while(a <= 10) {
			
			sum += a;  //sum = sum + a;
			
			a++; //제어변수 조작을 통해 반복의 조건식이 언젠가는 false되도록 처리
		}
		
		System.out.println("결과:" + sum);
		
		
//		int sum = 0;
//		
//		sum = sum + 1;
//		sum = sum + 2;
//		sum = sum + 3;
//		sum = sum + 4;
//		sum = sum + 5;
//		sum = sum + 6;
//		sum = sum + 7;
//		sum = sum + 8;
//		sum = sum + 9;
//		sum = sum + 10;
//		
//		System.out.println(sum);
		
		
		
		
		
		
	}
}
