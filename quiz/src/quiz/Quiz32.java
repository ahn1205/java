package quiz;

import java.util.Scanner;

public class Quiz32 {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		int okCount = 0; //정답카운트
		int noCount = 0; //오답카운트
		
		while(true) {
			
			int rn1 = (int)(Math.random() * 100) + 1;
			int rn2 = (int)(Math.random() * 100) + 1;
			int oper = (int)(Math.random() * 2);
			
			int correct = 0;
			if(oper == 0) {
				correct = rn1 + rn2;
				System.out.println("--------------");
				System.out.println(rn1 + " + " + rn2 + " = ? ");
				System.out.println("[문제를 그만 푸시려면 0을 입력하세요.]");
				System.out.print("> ");
			} else {
				correct = rn1 - rn2;
				System.out.println("--------------");
				System.out.println(rn1 + " - " + rn2 + " = ? ");
				System.out.println("[문제를 그만 푸시려면 0을 입력하세요.]");
				System.out.print("> ");
			}
			
			int answer = scan.nextInt(); //입력받은 수

			if(answer == 0) {
				break;
			}
			
			if(answer == correct) {
				System.out.println("정답입니다");
				okCount++;
			} else {
				System.out.println("틀렸는데요?");
				noCount++;
			}
		
		}
	
		System.out.println("프로그램 정상 종료");
		System.out.println("정답:" + okCount);
		System.out.println("오답:" + noCount);
		
		
		
	}
}
