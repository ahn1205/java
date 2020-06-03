package quiz;

import java.util.Scanner;

public class Quiz17 {

	public static void main(String[] args) {
		
		//1. 1~입력받은 정수까지 3의 배수 이거나, 4의 배수 일 경우에 출력
		/*
		Scanner scan = new Scanner(System.in);
		System.out.print("정수입력>");
		int num = scan.nextInt();
		
		int i = 1;
		while( i <= num) {
			
			if(i % 3 ==0 || i % 4 ==0 )
				System.out.print(i + " ");
	
			i++;
		}
		*/
		
		
		//2. 1~입력받은 정수까지 6의 배수의 합
		/*
		Scanner scan = new Scanner(System.in);
		System.out.print("정수입력>");
		int num = scan.nextInt();

		int i = 1;
		int sum = 0;
		while(i <= num) {
			
			if(i % 6 == 0)
				sum = sum + i;
				
			i++;
		}
		*/
		//3. 1~100까지 정수 중의 4의 배수이면서 8의 배수가 아닌 수가 개수.
		/*
		int i = 1;
		int count = 0; //개수를 셀 변수
		while(i <= 100) {
			
			if(i % 4 == 0 && i % 8 != 0)
				count++;
			
			i++;
		}
		System.out.println("100까지 4의 배수이면서 8의 배수가 아닌 개수:" + count);
		*/
		
		
		//4. 1000의 약수의 개수 구하세요.
		
		int i = 1;
		int count = 0;
		while(i <= 1000) {
			
			if(1000 % i == 0) {
				count++;
			}
			
			i++;
		}
		System.out.println("1000까지 약수의개수:" + count);
		
		
		
		
	}
}
