package quiz25;

import java.util.Scanner;

public class MainClass2 {

	public static void main(String[] args) {
		
		 Scanner scan = new Scanner(System.in);
		 int correct = (int)(Math.random() * 100) + 1;
		 int count = 0;

		 while(true) {
			 
			try {
				System.out.print("1과 100사이의 값을 입력하세요>");
				int answer = scan.nextInt();
				
				count++; //시도횟수 증가
				if(answer < correct) {
					System.out.println("더 큰수를 입력하세요");
				} else if(answer > correct) {
					System.out.println("더 작은 수를 입력하세요");
				} else {
					System.out.println("정답입니다");
					System.out.println("시도 횟수는:" + count);
					
					break;
				}
				
			} catch (Exception e) {
				System.out.println("잘못 입력했습니다");
				scan.nextLine();
				count++;
			}


		 }
		 
		 scan.close();
	}
}
