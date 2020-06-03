package quiz26;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		
		
		/*
		 * 정수를 2번 입력 받습니다.
		 * 첫번째 입력받은 랜덤 번째에서 , 두번째 입력받은 랜덤 값을 나눈 결과를 출력하면 됩니다. 
		 * 
		 * 발생되는 모든 에러를 종류별로 처리하세요.
		 */
		String[] arr = {"0", "1", "2", "3", "4", "5"};
		
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			
			try {
				System.out.print(">");
				int ran1 = scan.nextInt();
				System.out.print(">");
				int ran2 = scan.nextInt();
				
				int num1 = Integer.parseInt( arr[ran1]);
				int num2 = Integer.parseInt( arr[ran2]);
				
				System.out.println(num1);
				System.out.println(num2);
				System.out.println("랜덤수를 나눈 결과:" + num1 / num2 );
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			
		}
		
		
		
		
	}
}
