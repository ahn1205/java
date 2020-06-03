package quiz25;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		/*
		 * 1. 스캐너를 통해서 정수 2개를 입력받습니다.
		 * 2. 입력받은 값이 정수라면 , 단순히 정수의 합을 출력하고 반복문을 종료하세요
		 * 3. 입력받은 값이 에러를 발생시키는 값이라면 "정수로만 입력하세요" 를 출력한 후에 다시 입력받습니다.
		 * 4. 반복문을 탈출하면 프로그램 정상 종료 문장을 띄워주세요.
		 * 
		 */
		
		Scanner scan = new Scanner(System.in);
					
		while(true) {
			
			try {
				System.out.print("정수1>");
				int num1 = scan.nextInt();
				System.out.print("정수2>");
				int num2 = scan.nextInt();
				
				System.out.println("합:" + (num1 + num2));
				break;
				
			} catch (Exception e) {
				System.out.println("정수로만 입력하세요");
				scan.nextLine();
			}
			
		}
		
		
		
		
	}
}
