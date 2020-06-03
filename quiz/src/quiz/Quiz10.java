package quiz;

import java.util.Scanner;

public class Quiz10 {

	public static void main(String[] args) {
		/*
		 * 정수 3개를 입력 받습니다.
		 * 가장 큰값, 가장 작은값, 중간값을 구해서 출력.
		 * 
		 */
		int max = 0;
		int mid = 0;
		int min = 0;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print(">");
		int num1 = scan.nextInt();
		System.out.print(">");
		int num2 = scan.nextInt();
		System.out.print(">");
		int num3 = scan.nextInt();
		
		
		if( num1 > num2 && num1 > num3 ) {//num1이 가장 큰 경우
			
			max = num1;
			
			if(num2 > num3) {
				mid = num2;
				min = num3;
			} else {
				mid = num3;
				min = num2;
			}
		} else if(num2 > num1 && num2 > num3) { //num2가 가장 큰 경우
			
			max = num2;
			
			if(num1 > num3) {
				mid = num1;
				min = num3;
			} else {
				mid = num3;
				min = num1;
			}
			
		} else { //num3이 가장 큰 경우
			
			max = num3;
			
			if(num2 > num1) {
				mid = num2;
				min = num1;
			} else {
				mid = num1;
				min = num2;
			}
			
		}
		System.out.println("max:" + max);
		System.out.println("mid:" + mid);
		System.out.println("min:" + min);
		
		
		
		
		
		
	}
}
