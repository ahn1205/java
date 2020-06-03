package day03;

import java.util.Scanner;

public class WhileEx02 {

	public static void main(String[] args) {
		
		//입력받은 수가 소수 인지 판별하는 코드. 소수(나누어 떨어지는 수가 1과 자신밖에 없는수)
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("정수 입력>");
		int num = scan.nextInt();
		
		
		int i = 2;
		while(num % i != 0) {
			
			i++;
		}
		
		
		System.out.println( num == i ? num +"은 소수" : num + "은 소수가 아닙니다" );
		
		
		
		
		
		
		
		
		
		
	}
}
