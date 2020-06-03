package quiz;

import java.util.Scanner;

public class MethodQuiz01 {

	public static void main(String[] args) {
		/*
		//print()
		System.out.println("정수 두개를 입력하세요");
		
		//input() 생성하고 2번 호출
		Scanner scan = new Scanner(System.in);
		System.out.print(">");
		int a = scan.nextInt();
		System.out.print(">");
		int b = scan.nextInt();
		
		//add() 결과를 반환하도록
		int result = a + b;
		
		//showResult()  result를 받아서 출력해주는 메서드
		System.out.println("결과:" +  result);
		*/
		
		print();
		
		int a = input();
		int b = input();
		
		int result = add(a , b);
		showResult(result);
		
	} //메인
	
	static void print() {
		System.out.println("정수 두개를 입력하세요");
		
	}
	
	static int input() {
		Scanner scan = new Scanner(System.in);
		System.out.print(">");
		int a = scan.nextInt();
		
		return a;
	}
	
	static int add(int a , int b) {
		return a+b;
	}
	
	static void showResult(int result) {
		System.out.println("결과:" +  result);
	}
	
	
	
	
}
