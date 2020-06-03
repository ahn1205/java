package quiz;

import java.util.Scanner;

public class Quiz30 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("정수입력>");
		int num = scan.nextInt();
		
		int count = 0; //나누어 떨어지는 수의 개수
		int sum = 0; //합계
		
		for(int i = 1; i <= num; i++) {

			count = 0; //소수 판별하기 전에 count값을 초기화
			//소수 판별을 위한 for문
			for(int j = 1; j <= i; j++) {
				
				if(i % j == 0) {
					count++;
				}

			}
			
			if(count == 2) 
				sum += i;
		}
		System.out.println("1에서" + num +"까지 합:" + sum);
		
		
	}
}
