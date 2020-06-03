package quiz;

import java.util.Scanner;

public class Quiz08 {
	//quiz06
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("정수를 입력하세요");
		System.out.print(">");
		int num = scan.nextInt(); //홀수 : num % 2 == 1, 짝수: num % 2 == 0

		if(num == 0) {
			System.out.println("0입니다");
		} else if (num < 0) {
			System.out.println(num + "은 음수 입니다");
		} else if(num % 2 == 0) {
			System.out.println(num + "은 짝수 입니다");
		} else if(num % 2 == 1){
			System.out.println(num + "은 홀수 입니다");
		}

		scan.close();
		
		



		}
	}
