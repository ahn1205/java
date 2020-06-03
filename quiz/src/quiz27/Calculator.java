package quiz27;

import java.util.Scanner;

public class Calculator {

	public int input() throws Exception {
		/*
		 * 1. 정수 2개를 받습니다.
		 * 2. 입력된 값이 정수라면 합계를 반환해주면 됩니다.
		 * 3. 예외가 발생할 수 있는 상황이라면 메서드를 종료하고 예외 메시지를 전달해주면 됩니다.
		 * 4. scan.close() 적절하게 처리해주세요.
		 */
		Scanner scan = null;
		
		try {
			scan = new Scanner(System.in);
			System.out.print(">");
			int num1 = scan.nextInt();
			System.out.print(">");
			int num2 = scan.nextInt();
			
			return num1 + num2;
			
		} catch (Exception e) {
			throw new Exception("숫자 값을 입력하세요");
		} finally {
			scan.close();
		}
		
		
	}
}
