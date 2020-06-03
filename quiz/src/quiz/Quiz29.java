package quiz;

import java.util.Scanner;

public class Quiz29 {

	public static void main(String[] args) {
		
		//가로, 세로를 입력 받습니다.
		//가로 길이, 세로길의 사각형을 출력하면 됩니다.
		//단, 윤곽만 나타나도록 처리를 합니다.
		
		Scanner scan = new Scanner(System.in);
		System.out.print("가로>");
		int w = scan.nextInt();
		System.out.print("세로>");
		int h = scan.nextInt();
		
		for(int i = 1; i <= h; i++) { //세로
			
			for(int j = 1; j <= w; j++) {//가로
			
				if(i == 1 || i == h) //첫행과 마지막 행
					System.out.print("*");
				else { //나머지 행
					if(j == 1 || j == w)//첫열과 마지막 열
						System.out.print("*");
					else 
						System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		
		
		
		
		
	
	}
}
