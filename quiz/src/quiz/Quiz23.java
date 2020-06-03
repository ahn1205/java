package quiz;

import java.util.Scanner;

public class Quiz23 {

	public static void main(String[] args) {
		
		//1. 7~100까지 정수 중 7의 배수를 가로로 출력
		for(int i = 7; i <= 100; i+=7) {
			System.out.print(i + " ");
		}
		System.out.println(); //줄바꿈
		
		//2. 1~100까지 정수 중 12의 배수를 가로로 출력
		for(int i = 1; i<= 100; i++) {
			if(i % 12 == 0 )
				System.out.print(i + " ");
		}
		System.out.println();
		
		//3. 1~200까지 정수 중의 9의 배수의 개수를 출력
		int count = 0;
		for(int i = 1; i <= 200; i++) {
			if(i % 9 == 0)
				count++;
		}
		System.out.println("9의 배수의 개수:" + count);
		
		//4. 50~100까지 두 수 사이의 합.
		int sum = 0;
		for(int i = 50; i <= 100; i++) {
			sum += i;
		}
		System.out.println("50~100까지 합:" + sum);

		//5. A~Z까지 출력. A=65~ Z=90
		for(char c = 'A'; c <= 'Z'; c++ ) {
			System.out.print(c + " ");
		}
		System.out.println();
		
		//6. 입력받은 정수까지 팩토리얼값을 구하세요. 팩토리얼) 5! = 5 x 4 x 3 x 2 x 1
		
		Scanner scan = new Scanner(System.in);
		System.out.print("정수 입력>");
		int num = scan.nextInt();
		
		int fac = 1;
		for(int i = 1; i <= num; i++) {
			fac *= i;
		}
		System.out.println(fac);
		
		
		
		
	}
}
