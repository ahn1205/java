package quiz;

import java.util.Scanner;

public class Quiz34 {

	public static void main(String[] args) {


 		Scanner scan = new Scanner(System.in);
 		System.out.print("금액을 입력하세요>");
 		int money = scan.nextInt();
		
		end:while(true) {
			
			
			System.out.println("남은금액:"+ money + "원");
			System.out.println("[1]데미소다 400원, [2]밀키스, [3]코카콜라, [4]잔돈받기");
			System.out.print("음료수 선택>");
			int num = scan.nextInt();
			
			
			
			switch (num) {
			case 1:
				
				if(money >= 400) {
					System.out.println("데미소다를 받았습니다");
					money -= 400;
				} else {
					System.out.println("금액이 부족합니다");
				}
				break;
			case 2:
				
				break;
			case 3:
				
				break;
			default:
				System.out.println("남은금액:" + money + "반환합니다");
				
				break end;
			}
			
		}
		
		
		
		
	}
}
