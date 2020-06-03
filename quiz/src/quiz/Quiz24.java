package quiz;

import java.util.Scanner;

public class Quiz24 {

	public static void main(String[] args) {
		
		//두 정수를 입력받습니다.
		//두 수의 크기는 정해지지 않았습니다.
		//두 수 사이의 합을 구하는 코드를 최대한 간략하게 작성해보세요.
		
		Scanner scan = new Scanner(System.in);
		System.out.print(">");
		int a = scan.nextInt();
		System.out.print(">");
		int b = scan.nextInt();
		
//		int sum = 0;
//		if(a == b) {
//			sum = 0;
//			
//		} else if (a > b) {
//			for(int i = b; i <= a; i++) {
//				sum += i;
//			}
//			
//		} else {
//			for(int i = a; i <= b; i++) {
//				sum += i;
//			}
//		}
		
		int sum = 0;
		for(int i = (a == b ? 0 : (a > b ? b : a)); i <= (a == b ? 0 : (a > b ? a : b)); i++) {
			sum += i;
		}
		
		
		System.out.println("합계:" +  sum);
		
		
		
		
		
		
		
		
	}
}
